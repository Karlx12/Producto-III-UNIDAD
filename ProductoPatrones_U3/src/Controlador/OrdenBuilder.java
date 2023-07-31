package Controlador;

import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

public class OrdenBuilder implements OrdenBuilderInterface {
    private List<Producto> productos;
    private Cliente cliente;
    private Dirección direcciónEnvio;
    private Dirección facturaciónEnvio;

    public OrdenBuilder() {
        this.productos = new ArrayList<>();
    }

    // Método para establecer la lista de productos
    public OrdenBuilder setProductos(List<Producto> productos) {
        this.productos = productos;
        return this;
    }

    @Override
    public OrdenBuilder setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    @Override
    public OrdenBuilder setDirecciónEnvio(Dirección direcciónEnvio) {
        this.direcciónEnvio = direcciónEnvio;
        return this;
    }

    @Override
    public OrdenBuilder setFacturaciónEnvio(Dirección facturaciónEnvio) {
        this.facturaciónEnvio = facturaciónEnvio;
        return this;
    }

    @Override
    public Orden build() {
        Orden orden = new Orden();
        orden.productos = this.productos;
        orden.cliente = this.cliente;
        orden.direcciónEnvio = this.direcciónEnvio;
        orden.facturaciónEnvio = this.facturaciónEnvio;
        return orden;
    }

    @Override
    public OrdenBuilderInterface addProducto(Producto producto) {
        productos.add(producto);
        return this;
    }
}
