package Controlador;


import Modelo.Cliente;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
// Patrón creacional - Builder
public class Orden  {
    private List<Producto> productos;
    private Cliente cliente;
    private Dirección direcciónEnvio;
    private Dirección facturaciónEnvio;


    private Orden() {
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
    


    public static class OrdenBuilder  implements OrdenBuilderInterface{

        private List<Producto> productos;
        private Cliente cliente;
        private Dirección direcciónEnvio;
        private Dirección facturaciónEnvio;


        public OrdenBuilder() {
            this.productos = new ArrayList<>();
        }

        @Override
        public OrdenBuilder addProducto(Producto producto) {
            this.productos.add(producto);
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
    }
}


