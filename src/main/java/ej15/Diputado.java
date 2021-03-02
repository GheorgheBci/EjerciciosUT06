package ej15;

/**
 *
 * @author Jorge
 */
public class Diputado extends Legislador {

    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Es un Diputado";
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString() + "Diputado{" + "numeroAsiento=" + numeroAsiento + '}';
    }
}
