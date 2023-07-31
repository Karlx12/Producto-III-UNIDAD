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

    public void actualizarTabla() {
        model = getModel();

        for (Producto producto : datos) {
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
            boolean cumpleFiltroCategoria = filtroCategoria.isEmpty() || producto.getClass().getSimpleName().equals(filtroCategoria);

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
                        id = (int) valorCelda;
                        break;
                    case "Nombre":
                        nombre = (String) valorCelda;
                        break;
                    case "Pedido":
                        pedido = (int) valorCelda;
                        break;
                    case "Stock":
                        stock = (int) valorCelda;
                        break;
                    case "Precio":
                        precio = (double) valorCelda;
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

        for (Producto producto : nuevosProductos) {
            boolean productoExiste = false;
            for (Producto p : productosExistentes) {
                if (p.getId() == producto.getId()) {
                    productoExiste = true;
                    break;
                }
            }

            if (!productoExiste) {
                productoDAO.CreateProducto(producto);
                productosExistentes.add(producto);
            }
        }
    }
}
