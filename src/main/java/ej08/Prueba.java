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
        
        /*
        Si el método es final no se puede sobreescribir en las 
        clases hijas
        
        Si la clase es final no puede tener hijas
        */
    }
}
