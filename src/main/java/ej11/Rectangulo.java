package ej11;

/**
 *
 * @author Jorge
 */
public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int calcularArea() {
        return this.base * this.altura;
    }
}
