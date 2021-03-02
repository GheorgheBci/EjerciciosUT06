package ej11;

/**
 *
 * @author Jorge
 */
public abstract class Figura {
    
    protected int base;
    protected int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract int calcularArea();
}
