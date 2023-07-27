package Modelo;

public class Producto {

    public int id;
    public String nombre;
    public String categoria1;
    public String categoria2;
    public int stock;
    public double precio;

    public Producto Producto(int id, String nombre, String categoria1, String categoria2, int stock, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria1 = categoria1;
        this.categoria2 = categoria2;
        this.stock = stock;
        this.precio = precio;
        return this;
        
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

    public void setCategoria2(String categoria2) {
        this.categoria2 = categoria2;
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

    public String getCategoria2() {
        return categoria2;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
    

}
