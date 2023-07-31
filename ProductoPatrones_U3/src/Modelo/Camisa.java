/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author maxx1212
 */
public class Camisa extends Producto implements Serializable{

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
        return Nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.Nombre = nombre;
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
        return Stock;
    }
    @Override
    public void setStock(int stock) {
        this.Stock = stock;
    }
    @Override
    public double getPrecio() {
        return Precio;
    }
    @Override
    public void setPrecio(double precio) {
        this.Precio = precio;
    }
    
}
