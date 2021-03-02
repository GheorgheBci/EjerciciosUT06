package ej11;

/**
 *
 * @author Jorge
 */
public class Triangulo extends Figura {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
