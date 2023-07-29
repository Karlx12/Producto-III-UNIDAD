package Controlador;

public class Main {

    public static void main(String[] args) {
        // Uso del patrón creacional - Builder para crear un pedido con recojo en tienda
        Orden ordenRecojoTienda = new Orden.OrdenBuilder()
                .addProducto(new Producto("Camisa", 29.99))
                .addProducto(new Producto("Pantalón", 49.99))
                .setCliente(new Cliente("Franco Morillo", "FM@gmail.com"))
                .setDirecciónEnvio(new Dirección("Lot1. Las Brisas", "Ciudad", "Pais", TipoCompra.RECOJO_TIENDA))
                .setFacturaciónEnvio(new Dirección("Manzana O-1", "Ciudad", "Pais", TipoCompra.RECOJO_TIENDA))
                .setTipoCompra(Orden.TipoCompra.RECOJO_TIENDA) // Definir el tipo de compra
                .build();

        // Uso del patrón creacional - Builder para crear un pedido con envío a domicilio
        Orden ordenEnvioDomicilio = new Orden.OrdenBuilder()
                .addProducto(new Producto("Camisa", 29.99))
                .addProducto(new Producto("Pantalón", 49.99))
                .setCliente(new Cliente("Juan Perez", "jp@gmail.com"))
                .setDirecciónEnvio(new Dirección("Lot1. Las Brisas", "Ciudad", "Pais", TipoCompra.ENVIO_DOMICILIO))
                .setFacturaciónEnvio(new Dirección("Manzana O-1", "Ciudad", "Pais", TipoCompra.ENVIO_DOMICILIO))
                .setTipoCompra(Orden.TipoCompra.ENVIO_DOMICILIO) // Definir el tipo de compra
                .build();

        // Uso del patrón estructural - Facade para realizar el pedido con recojo en tienda
        OrdenFacade ordenFacade = new OrdenFacade();
        ordenFacade.realizarOrden(ordenRecojoTienda);

        // Uso del patrón estructural - Facade para realizar el pedido con envío a domicilio
        ordenFacade.realizarOrden(ordenEnvioDomicilio);
    }
}
