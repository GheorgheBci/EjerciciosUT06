package ej07;

/**
 *
 * @author Jorge
 */
public class Programador extends Trabajador{
    
    private int experiencia;

    public Programador(int experiencia, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.experiencia = experiencia;
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizando como Programador");
    }  
}
