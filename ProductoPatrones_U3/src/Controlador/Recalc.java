/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
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
                        fila[i] = registro.nombre;
                        break;
                    case "Pedido":
                        fila[i] = registro.Pedido;
                        break;
                    case "stock":
                        fila[i] = registro.stock;
                        break;
                    case "precio":
                        fila[i] = registro.precio;
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

}