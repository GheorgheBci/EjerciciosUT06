package ej03;

/**
 *
 * @author Jorge
 */
public class Programador extends Empleado {

    private TipoCategoria categoria;

    public Programador(TipoCategoria categoria, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Programador() {

    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Programador{" + "categoria=" + categoria + '}';
    }
    
    
}
