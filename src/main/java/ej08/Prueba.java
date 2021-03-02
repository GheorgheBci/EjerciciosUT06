package ej08;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Azar> listaNumeros = new ArrayList<>();
        
        listaNumeros.add(new Dado());
        listaNumeros.add(new Moneda());
        
        for (Azar listaNumero : listaNumeros) {
            System.out.println(listaNumero.lanzar());
        }
    }
}
