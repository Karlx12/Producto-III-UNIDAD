package Controlador;

import Modelo.Camisa;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Shorts;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Recalc {
    private List<Producto> datos;
    private ProductoDAO productoDAO = new ProductoDAO();
    private DefaultTableModel model;

    public Recalc() {
        datos = productoDAO.cargarProductos();
        model = crearModeloTabla();
    }

    public void recalcular() {
        datos = productoDAO.cargarProductos();
        // Limpiar el modelo de la tabla
        model.setRowCount(0);
    }

    public DefaultTableModel getModel() {
        if (model == null) {
            model = crearModeloTabla();
        }
        return model;
    }

    private DefaultTableModel crearModeloTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Pedido");
        model.addColumn("Stock");
        model.addColumn("Precio");
        return model;
    }

    public void actualizarTabla(List<Producto> productos) {
        model.setRowCount(0);

        for (Producto producto : productos) {
            Object[] fila = new Object[5];
            fila[0] = producto.getId();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPedido();
            fila[3] = producto.getStock();
            fila[4] = producto.getPrecio();
            model.addRow(fila);
        }
    }


    public List<Producto> filtrarTabla(String filtroNombre, String filtroCategoria) {
        List<Producto> resultados = new ArrayList<>();

        for (Producto producto : datos) {
            boolean cumpleFiltroNombre = filtroNombre.isEmpty() || producto.getNombre().contains(filtroNombre);
            boolean cumpleFiltroCategoria = filtroCategoria.isEmpty() || filtroCategoria.equals("Todos") || producto.getClass().getSimpleName().equals(filtroCategoria);

            if (cumpleFiltroNombre && cumpleFiltroCategoria) {
                resultados.add(producto);
            }
        }

        return resultados;
    }


    public List<Producto> extraerDatosDesdeTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();

        int numColumnasTabla = model.getColumnCount();
        List<String> columnasTabla = new ArrayList<>();
        for (int i = 0; i < numColumnasTabla; i++) {
            columnasTabla.add(model.getColumnName(i));
        }

        List<Producto> nuevosProductos = new ArrayList<>();
        for (int fila = 0; fila < model.getRowCount(); fila++) {
            String categoria = null;
            int id = 0;
            String nombre = null;
            int pedido = 0;
            int stock = 0;
            double precio = 0.0;

            for (int col = 0; col < numColumnasTabla; col++) {
                String columnaActual = columnasTabla.get(col);
                Object valorCelda = model.getValueAt(fila, col);
                switch (columnaActual) {
                    case "Id":
                        if (valorCelda instanceof String) {
                            id = Integer.parseInt((String) valorCelda);
                        } else {
                            id = (int) valorCelda;
                        }
                        break;
                    case "Nombre":
                        nombre = ((String) valorCelda);
                        break;
                    case "Pedido":
                        if (valorCelda instanceof String) {
                        pedido = Integer.parseInt((String) valorCelda);
                        } else {
                            pedido = (int) valorCelda;
                        }
                        break;
                    case "Stock":
                        if (valorCelda instanceof String) {
                        stock = Integer.parseInt((String) valorCelda);
                        } else {
                            stock = (int) valorCelda;
                        }
                        break;
                    case "Precio":
                        if (valorCelda instanceof String) {
                        precio = Double.parseDouble((String) valorCelda);
                        } else {
                            precio = (double) valorCelda;
                        }
                        break;
                    default:
                        // Ignorar columnas desconocidas o no utilizadas en Producto
                }
            }

            Producto producto;
            if ("Camisa".equals(categoria)) {
                producto = new Camisa(id, nombre, pedido, stock, precio);
            } else if ("Shorts".equals(categoria)) {
                producto = new Shorts(id, nombre, pedido, stock, precio);
            } else {
                continue;
            }

            nuevosProductos.add(producto);
        }

        return nuevosProductos;
    }

    public void guardarNuevosProductos(List<Producto> nuevosProductos) {
    List<Producto> productosExistentes = productoDAO.cargarProductos();

    // Eliminar productos que han sido borrados de la tabla
    for (Producto productoExistente : productosExistentes) {
        boolean productoBorrado = true;
        for (Producto nuevoProducto : nuevosProductos) {
            if (productoExistente.getId() == nuevoProducto.getId()) {
                productoBorrado = false;
                break;
            }
        }
        if (productoBorrado) {
            productoDAO.productoDelete(productoExistente);
        }
    }

    // Guardar o actualizar los productos existentes
    for (Producto nuevoProducto : nuevosProductos) {
        boolean productoExiste = false;
        for (Producto productoExistente : productosExistentes) {
            if (productoExistente.getId() == nuevoProducto.getId()) {
                productoExiste = true;
                break;
            }
        }

        if (productoExiste) {
            productoDAO.UpdateProducto(nuevoProducto);
        } else {
            productoDAO.CreateProducto(nuevoProducto);
        }
    }

    // Actualizar la lista de datos con los nuevos productos
    datos = productoDAO.cargarProductos();
}

}
