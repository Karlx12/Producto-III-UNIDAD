package Controlador;

public interface OrdenBuilderInterface {
    OrdenBuilderInterface addProducto(Producto producto);
    OrdenBuilderInterface setCliente(Cliente cliente);
    OrdenBuilderInterface setDirecciónEnvio(Dirección direcciónEnvio);
    OrdenBuilderInterface setFacturaciónEnvio(Dirección facturaciónEnvio);
    Orden build();
}
