package ej12;

/**
 *
 * @author george
 */
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente(Persona cliente, double saldo) {
        super(cliente, saldo);
        this.interes = 1.5;
        this.saldoMin = 1000;
    }

    @Override
    public void actualizarSaldo() {
        if (this.getSaldo() > this.saldoMin) {
            System.out.println("Tu saldo en este momento es: " + (this.getSaldo() + (this.getSaldo() * this.interes)));
        } else {
            System.out.println("Tu saldo en este momento es: " + (this.getSaldo() + (this.getSaldo() + this.interes)));
        }
    }

    @Override
    public void retirar(double saldo) {
        while (this.getSaldo() >= this.saldoMin) {
            saldo -= this.getSaldo();
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + '}';
    }
}
