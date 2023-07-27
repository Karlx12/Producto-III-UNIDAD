package Controlador;

import Modelo.Cliente;
import Modelo.Producto;

public interface OrdenBuilderInterface {
    OrdenBuilderInterface addProducto(Producto producto);
    OrdenBuilderInterface setCliente(Cliente cliente);
    OrdenBuilderInterface setDirecciónEnvio(Dirección direcciónEnvio);
    OrdenBuilderInterface setFacturaciónEnvio(Dirección facturaciónEnvio);
    Orden build();
}
