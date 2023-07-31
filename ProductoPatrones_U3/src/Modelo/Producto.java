package Modelo;

public abstract class Producto {

    public int id;
    public String Nombre;
    public int Pedido;
    public int Stock;
    public double Precio;

    public Producto(int id, String Nombre, int Pedido, int Stock, double Precio) {
        this.id = id;
        this.Nombre = Nombre;
        this.Pedido = Pedido;
        this.Stock = Stock;
        this.Precio = Precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPedido() {
        return Pedido;
    }

    public void setPedido(int Pedido) {
        this.Pedido = Pedido;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }


    

}
