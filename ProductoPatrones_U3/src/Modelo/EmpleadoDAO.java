package Modelo;

import java.util.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EmpleadoDAO {
    String ruta=System.getProperty("user.dir");
    private final String NOMBRE_ARCHIVO = ruta+"/empleados.dat";

    public void empleadoCreate(Empleado empleado) {
        
        List<Empleado> empleados = cargarEmpleados();

        empleados.add(empleado);

        guardarEmpleados(empleados);
    }

    public void empleadoUpdate(Empleado empleado) {
        List<Empleado> empleados = cargarEmpleados();

        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = empleados.get(i);
            if (e.getId() == empleado.getId()) {
                empleados.set(i, empleado);
                break;
            }
        }

        guardarEmpleados(empleados);
    }

    public void empleadoDelete(Empleado empleado) {
        List<Empleado> empleados = cargarEmpleados();

        empleados.removeIf(e -> e.getId() == empleado.getId());

        guardarEmpleados(empleados);
    }

    public Empleado empleadoRead(int id) {
        List<Empleado> empleados = cargarEmpleados();

        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }

        return null;
    }

    private List<Empleado> cargarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            while (true) {
                Empleado empleado = (Empleado) ois.readObject();
                empleados.add(empleado);
            }
        } catch (EOFException e) {
            // Final del archivo
        } catch (IOException | ClassNotFoundException e) {
        }

        return empleados;
    }

    private void guardarEmpleados(List<Empleado> empleados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            for (Empleado empleado : empleados) {
                oos.writeObject(empleado);
            }
        } catch (IOException e) {
        }
    }
    
}
