package Controlador;

import Modelo.Camisa;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.ProductoDAO;
import Modelo.Shorts;
import Vista.Login;


public class Main {

    public static void main(String[] args) {
        new ProductoDAO().CreateProducto(new Shorts(1,"shorts largos",0,50,12));
        new Login().setVisible(true);
        

        
    }
}
