package Modelo;

import java.util.*;

public class ProductoDAO {
    
    private static final String NOMBRE_ARCHIVO = "DATABASE/productos.dat";

    public void productoCreate(Producto producto) {
        List<Producto> productos = cargarProductos();

        productos.add(producto);

        guardarProductos(productos);
    }

    public void productoUpdate(Producto producto) {
        List<Producto> productos = cargarProductos();

        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (p.getId() == producto.getId()) {
                productos.set(i, producto);
                break;
            }
        }

        guardarProductos(productos);
    }

    public void productoDelete(Producto producto) {
        List<Producto> productos = cargarProductos();

        productos.removeIf(p -> p.getId() == producto.getId());

        guardarProductos(productos);
    }

    public Producto productoRead(int id) {
        List<Producto> productos = cargarProductos();

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }

        return null;
    }

    private List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            while (true) {
                Producto producto = (Producto) ois.readObject();
                productos.add(producto);
            }
        } catch (EOFException e) {
            // Final del archivo
        } catch (IOException | ClassNotFoundException e) {
        }

        return productos;
    }

    private void guardarProductos(List<Producto> productos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            for (Producto producto : productos) {
                oos.writeObject(producto);
            }
        } catch (IOException e) {
            
        }
    }
    
}
