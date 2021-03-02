package ej08;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Moneda extends Azar{
    
     private static Random ran = new Random();

    @Override
    public int lanzar() {
      int numero = ran.nextInt(2 - 1 + 1) + 1;
      
      return numero;
    }   
}
