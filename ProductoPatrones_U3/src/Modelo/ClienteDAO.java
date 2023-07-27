
package Modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class ClienteDAO {
    
    private static final String NOMBRE_ARCHIVO = "DATABASE/clientes.dat";

    public void clienteCreate(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();

        clientes.add(cliente);

        guardarClientes(clientes);
    }

    public void clienteUpdate(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getId() == cliente.getId()) {
                clientes.set(i, cliente);
                break;
            }
        }

        guardarClientes(clientes);
    }

    public void clienteDelete(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();

        clientes.removeIf(c -> c.getId() == cliente.getId());

        guardarClientes(clientes);
    }

    public Cliente clienteRead(int id) {
        List<Cliente> clientes = cargarClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }

        return null;
    }

    private List<Cliente> cargarClientes() {
        List<Cliente> clientes = new ArrayList<>(); 

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            while (true) {
                Cliente cliente = (Cliente) ois.readObject();
                clientes.add(cliente);
            }
        } catch (EOFException e) {
            // Final del archivo
        } catch (IOException | ClassNotFoundException e) {
        }

        return clientes;
    }

    private void guardarClientes(List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            for (Cliente cliente : clientes) {
                oos.writeObject(cliente);
            }
        } catch (IOException e) {
        }
    }
    
}

