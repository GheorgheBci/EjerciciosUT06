package ej15;

/**
 *
 * @author Jorge
 */
public class Senador extends Legislador {

    private double complemento;

    public Senador(double complemento, String provincia, String partidoPolitico, String nombre, String apellidos) {
        super(provincia, partidoPolitico, nombre, apellidos);
        this.complemento = complemento;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Es un Senador";
    }

    public double getComplemento() {
        return complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return super.toString() + "Senador{" + "complemento=" + complemento + '}';
    }

}
