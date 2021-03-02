package ej03;

/**
 *
 * @author Jorge
 */
public class Empleado extends Persona {

    private int salario;

    public Empleado(int salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    public Empleado() {

    }

    public int aumentarSalario(int aumento) {
        return this.salario += aumento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "salario=" + salario + '}';
    }

}
