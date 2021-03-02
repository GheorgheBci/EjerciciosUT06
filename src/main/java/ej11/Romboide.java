package ej11;

/**
 *
 * @author Jorge
 */
public class Romboide extends Figura {

    public Romboide(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        return this.base * this.altura;
    }
}
