package ej12;

import java.util.Random;

/**
 *
 * @author george
 */
public abstract class Cuenta {

    private static Random ra = new Random();

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        int digito = ra.nextInt(9);

        do {

            this.numeroCuenta += digito;

        } while (numeroCuenta.length() == 20);

    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double saldo);

    public static Random getRa() {
        return ra;
    }

    public static void setRa(Random ra) {
        Cuenta.ra = ra;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

}
