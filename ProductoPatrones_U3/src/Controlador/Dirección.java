package Controlador;


public class Dirección {
    private String calle;
    private String ciudad;
    private String país;
    private TipoCompra tipoCompra;

    public Dirección(String calle, String ciudad, String país, TipoCompra tipoCompra) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.país = país;
        this.tipoCompra = tipoCompra;
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

    // Getter para el tipo de compra
    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }

    // Setter para el tipo de compra
    public void setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
    }
}
