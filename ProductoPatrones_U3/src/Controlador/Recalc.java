/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Camisa;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Modelo.Shorts;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxx1212
 */
public class Recalc {
    private List<Producto> datos; 
    private ProductoDAO productoDAO = new ProductoDAO();
    public Recalc() {
        
        datos = new ArrayList<>();
        
    }
    public DefaultTableModel Actualizar(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();


        int numColumnasTabla = model.getColumnCount();



        for (Producto registro : datos) {
            Object[] fila = new Object[numColumnasTabla];
            for (int i = 0; i < numColumnasTabla; i++) {
                String columnaActual = model.getColumnName(i);
                switch (columnaActual) {
                    case "id":
                        fila[i] = registro.id;
                        break;
                    case "nombre":
                        fila[i] = registro.Nombre;
                        break;
                    case "Pedido":
                        fila[i] = registro.Pedido;
                        break;
                    case "stock":
                        fila[i] = registro.Stock;
                        break;
                    case "precio":
                        fila[i] = registro.Precio;
                        break;
                    default:
                        fila[i] = null; 
                }
            }
            model.addRow(fila);
        }

        return model; 
    }



    public List<Producto> filtrarTabla(String filtroNombre, String filtroCategoria) {
        List<Producto> resultados = new ArrayList<>();

        for (Producto registro : datos) {
            boolean cumpleFiltroNombre = filtroNombre.isEmpty() || registro.getNombre().contains(filtroNombre);
            boolean cumpleFiltroCategoria = filtroCategoria.isEmpty() || registro.getClass().getName().equals(filtroCategoria);

            if (cumpleFiltroNombre && cumpleFiltroCategoria) {
                resultados.add(registro);
            }
        }

        return resultados;
    }
    public void extraerTabla(JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        List<Producto> productosExistentes = productoDAO.cargarProductos();

        int numColumnasTabla = model.getColumnCount();
        List<String> columnasTabla = new ArrayList<>();
        for (int i = 0; i < numColumnasTabla; i++) {
            columnasTabla.add(model.getColumnName(i));
        }

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
                    case "id":
                        id = (int) valorCelda;
                        break;
                    case "nombre":
                        nombre = (String) valorCelda;
                        break;
                    case "Pedido":
                        pedido = (int) valorCelda;
                        break;
                    case "stock":
                        stock = (int) valorCelda;
                        break;
                    case "precio":
                        precio = (double) valorCelda;
                        break;
                    case "categoria":
                        categoria = (String) valorCelda;
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