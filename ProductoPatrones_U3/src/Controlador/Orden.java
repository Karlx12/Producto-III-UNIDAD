package Controlador;


import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
// Patrón creacional - Builder
public class Orden  {
    List<Producto> productos;
    Cliente cliente;
    Dirección direcciónEnvio;
    Dirección facturaciónEnvio;


    Orden() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double getCantidadTotal() {
        double total = 0.0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    


}

