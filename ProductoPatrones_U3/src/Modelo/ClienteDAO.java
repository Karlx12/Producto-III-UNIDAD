package Modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ClienteDAO {
    String ruta = System.getProperty("user.dir");
    private final String NOMBRE_ARCHIVO = ruta + "/clientes.dat";

    public void clienteCreate(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();

        clientes.add(cliente);

        guardarClientes(clientes);
    }

    public void clienteUpdate(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();
        boolean clienteEncontrado = false;

        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if (c.getUsuario().equals(cliente.getUsuario())) {
                clientes.set(i, cliente);
                clienteEncontrado = true;
                break;
            }
        }

        if (!clienteEncontrado) {
            throw new IllegalArgumentException("Cliente no encontrado para actualizar.");
        }

        guardarClientes(clientes);
    }

    public void clienteDelete(Cliente cliente) {
        List<Cliente> clientes = cargarClientes();
        boolean clienteEliminado = clientes.removeIf(c -> c.getUsuario().equals(cliente.getUsuario()));

        if (!clienteEliminado) {
            throw new IllegalArgumentException("Cliente no encontrado para eliminar.");
        }

        guardarClientes(clientes);
    }

    public Cliente clienteRead(String nombre) {
        List<Cliente> clientes = cargarClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(nombre)) {
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
            // Final del archivo, no es un error
        } catch (IOException | ClassNotFoundException e) {
            // Error al leer el archivo o clase no encontrada
            System.err.println("Error al cargar los clientes: " + e.getMessage());
        }

        return clientes;
    }

    private void guardarClientes(List<Cliente> clientes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            for (Cliente cliente : clientes) {
                oos.writeObject(cliente);
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los clientes: " + e.getMessage());
        }
    }
}
