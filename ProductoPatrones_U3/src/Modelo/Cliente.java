
package Modelo;

import Controlador.Dirección;

public class Cliente {
    public int id;
    public String usuario;
    public String contraseña;
    public String nombres;
    public String apellidos;
    public String email;
    public Dirección direccion;
    public int telefono;

    public Cliente Cliente(int id, String usuario, String contraseña, String nombres, String apellidos, String email, Dirección direccion, int telefono) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        return this;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }



    public int getTelefono() {
        return telefono;
    }

    public Dirección getDireccion() {
        return direccion;
    }

    public void setDireccion(Dirección direccion) {
        this.direccion = direccion;
    }
    
    
}
