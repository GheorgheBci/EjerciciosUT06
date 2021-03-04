package ej12;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        ArrayList<Cuenta> listaDeCuentas = new ArrayList<>();
        
        Persona p1 = new Persona("Juan", "Pérez", "64736894P");
        Persona p2 = new Persona("José", "Romero", "93570245M");
        Persona p3 = new Persona("Selena", "Rámirez", "48200924L");
        Persona p4 = new Persona("Sandra", "Pérez", "13850334J");
        
        listaDeCuentas.add(new CuentaCorriente(p1, 5000));
        listaDeCuentas.add(new CuentaCorriente(p2, 400));
        listaDeCuentas.add(new CuentaAhorro(2.3, 4.7, p3, 2000));
        listaDeCuentas.add(new CuentaAhorro(1.2, 3.4, p4, 200));
        
        for (Cuenta listaDeCuenta : listaDeCuentas) {
            listaDeCuenta.retirar(200);
            System.out.println(listaDeCuenta);
        }
    }
}
