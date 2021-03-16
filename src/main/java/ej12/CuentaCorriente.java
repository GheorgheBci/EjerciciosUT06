package ej12;

/**
 *
 * @author george
 */
public class CuentaCorriente extends Cuenta {

    private final double INTERES = 1.5;
    private double saldoMin;

    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
    }

    @Override
    public void actualizarSaldo(double saldo) {
        if (this.getSaldo() > 1000) {
            this.setSaldoMin(this.getSaldo() + (this.getSaldo() * INTERES));
        } else {
            this.setSaldoMin(this.getSaldo() + (this.getSaldo() + INTERES));
        }
    }

    @Override
    public void retirar(double saldo) {
        while (this.getSaldo() > this.saldoMin) {
            this.setSaldoMin(saldo -= this.getSaldo());
        }
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }
}
