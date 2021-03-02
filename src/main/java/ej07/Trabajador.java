package ej07;

/**
 *
 * @author Jorge
 */
public abstract class Trabajador {

    private String nombre;
    private String apellido1;
    private String NIF;

    public Trabajador(String nombre, String apellido1, String NIF) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.NIF = NIF;
    }

    public abstract void cotizar();
}
