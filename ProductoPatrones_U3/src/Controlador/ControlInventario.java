package Controlador;

import Modelo.Producto;

public class ControlInventario {



    public boolean checkDisponibilidad(Producto producto) {
        int cantidad_pedida=producto.getPedido();
        // Lógica para verificar la disponibilidad del producto en el inventario
        if (producto == null) {
            throw new IllegalArgumentException("Producto inválido");
        }
        int stockDisponible = producto.getStock();
        return stockDisponible >= cantidad_pedida;
    }
 
    public void reservarProducto(Producto producto) {
        int cantidad_pedida=producto.getPedido();
        if (producto == null) {
            throw new IllegalArgumentException("Producto inválido");
        }
        // Lógica para reservar el producto en el inventario
        int stockActual = producto.getStock();
        if (stockActual >= cantidad_pedida) {
            producto.setStock(stockActual - cantidad_pedida);
            System.out.println("Producto reservado --> Stock actualizado: " + producto.getStock());
        } else {
            System.out.println("Cantidad de productos insuficientes para la reserva.");
        }

    }
}
