package Controlador;

import java.io.Serializable;


public class Dirección implements Serializable{
    private String calle;
    private String ciudad;
    private String país;
 

    public Dirección(String calle, String ciudad, String país) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.país = país;

    }

    // Getter para la calle
    public String getCalle() {
        return calle;
    }

    // Setter para la calle
    public void setCalle(String calle) {
        this.calle = calle;
    }

    // Getter para la ciudad
    public String getCiudad() {
        return ciudad;
    }

    // Setter para la ciudad
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Getter para el país
    public String getPaís() {
        return país;
    }

    // Setter para el país
    public void setPaís(String país) {
        this.país = país;
    }


}
