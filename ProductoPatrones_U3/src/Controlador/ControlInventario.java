package Controlador;

public class ControlInventario {
    public boolean checkDisponibilidad(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto inválido");
        }
        // Lógica para verificar la disponibilidad del producto en el inventario
        return true;
    }

    public void reservarProducto(Producto producto) {
        if (producto == null) {
            throw new IllegalArgumentException("Producto inválido");
        }
        // Lógica para reservar el producto en el inventario
    }
}
