package ej13;

/**
 *
 * @author george
 */
public class Direccion {

    private String nombreCalle;
    private String nombreCiudad;
    private int codigoPostal;
    private String nombrePais;

    public Direccion(String nombreCalle, String nombreCiudad, int codigoPostal, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codigoPostal = codigoPostal;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreCalle=" + nombreCalle + ", nombreCiudad=" + nombreCiudad + ", codigoPostal=" + codigoPostal + ", nombrePais=" + nombrePais + '}';
    }
}
