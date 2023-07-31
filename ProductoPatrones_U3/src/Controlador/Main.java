package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.ProductoDAO;
import Modelo.Shorts;
import Vista.Login;


public class Main {

    public static void main(String[] args) {
        
        new Login().setVisible(true);
        ProductoDAO pm=new ProductoDAO();
        pm.CreateProducto(new Shorts(1,"Shortsas",60,520,50));
        System.out.println(pm.productoRead("Shortsas"));
        
    }
}
