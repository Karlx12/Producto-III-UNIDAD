package Controlador;

// Patrón estructural - Facade
import Modelo.Producto;

public class OrdenFacade {

    private ControlInventario controlInventario;
    private PagoServicio pagoServicio;
    private ServicioEnvio servicioEnvio;

    public OrdenFacade() {
        this.controlInventario = new ControlInventario();
        this.pagoServicio = new PagoServicio();
        this.servicioEnvio = new ServicioEnvio();
    }

    public boolean realizarOrden(Orden orden) {
        boolean ordenProcesada = true; // Variable para verificar si la orden se procesa con éxito

        // Verificar disponibilidad de productos y reservar en el inventario
        for (Producto producto : orden.getProductos()) {
            if (controlInventario.checkDisponibilidad(producto)) {
                controlInventario.reservarProducto(producto);
            } else {
                System.out.println("Producto agotado: " + producto.getNombre());
                ordenProcesada = false; // Si hay algún producto agotado, la orden no se puede procesar completamente
                break;
            }
        }
        
        // Procesar el pago
        if (pagoServicio.procesoPago(orden.getCliente(), orden.getCantidadTotal()) && ordenProcesada) {
            // Enviar el pedido
            servicioEnvio.shipOrden(orden);
            System.out.println("Pedido realizado con éxito.");
        } else {
            System.out.println("Error en el procesamiento del pago.");
            ordenProcesada = false; // Si hay un error en el pago, la orden no se puede procesar completamente
        }

        return ordenProcesada; // Devolvemos true si la orden se procesó con éxito, false en caso contrario
    }
}