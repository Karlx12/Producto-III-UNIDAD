package Controlador;

// Patrón estructural - Facade
public class OrdenFacade {
    private ControlInventario controlInventario;
    private PagoServicio pagoServicio;
    private ServicioEnvio servicioEnvio;

    public OrdenFacade() {
        this.controlInventario = new ControlInventario();
        this.pagoServicio = new PagoServicio();
        this.servicioEnvio = new ServicioEnvio();
    }

    public void realizarOrden(Orden orden) {
        // Verificar disponibilidad de productos y reservar en el inventario
        for (Producto producto : orden.getProductos()) {
            if (controlInventario.checkDisponibilidad(producto)) {
                controlInventario.reservarProducto(producto);
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
                return;
            }
        }

        // Procesar el pago
        if (pagoServicio.procesoPago(orden.getCliente(), orden.getCantidadTotal())) {
            // Enviar el pedido
            servicioEnvio.shipOrden(orden);
            System.out.println("Pedido realizado con éxito.");
        } else {
            System.out.println("Error en el procesamiento del pago.");
        }
    }
}
