package ej08;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Dado extends Azar {

    private static Random ran = new Random();

    @Override
    public int lanzar() {
        int numero = ran.nextInt(6 - 1 + 1) + 1;

        return numero;
    }
}
