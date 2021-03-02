package ej07;

/**
 *
 * @author Jorge
 */
public class Camarero extends Trabajador {

    private String rango;

    public Camarero(String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }

    public void servirMesa(){
        System.out.println("Objeto Camarero: Sirviendo una mesa");
    }
    
    @Override
    public void cotizar() {
        System.out.println("Cotizando como Camarero");
    }
}
