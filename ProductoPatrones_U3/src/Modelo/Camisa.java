/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author maxx1212
 */
public class Camisa extends Producto {

    public Camisa(int id, String nombre, int Pedido, int stock, double precio) {
        super(id, nombre, Pedido, stock, precio);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getPedido() {
        return Pedido;
    }

    @Override
    public void setPedido(int Pedido) {
        this.Pedido = Pedido;
    }

    @Override
    public int getStock() {
        return stock;
    }
    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
