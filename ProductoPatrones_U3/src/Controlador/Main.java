package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Vista.Login;


public class Main {

    public static void main(String[] args) {
        
        new Login().setVisible(true);
        EmpleadoDAO em=new EmpleadoDAO();
        em.empleadoCreate(new Empleado(1,"max","max","max","max",5121));
        
    }
}
