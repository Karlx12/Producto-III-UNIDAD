package Modelo;

public class Producto {

    public int id;
    public String nombre;
    public String categoria1;
    public int Pedido;
    public int stock;
    public double precio;

    public  Producto(int id, String nombre, String categoria1, int Pedido, int stock, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria1 = categoria1;
        this.Pedido = Pedido;
        this.stock = stock;
        this.precio = precio;
        
        
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria1(String categoria1) {
        this.categoria1 = categoria1;
    }

    public void setPedido(int Pedido) {
        this.Pedido = Pedido;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria1() {
        return categoria1;
    }

    public int getPedido() {
        return Pedido;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }


}
