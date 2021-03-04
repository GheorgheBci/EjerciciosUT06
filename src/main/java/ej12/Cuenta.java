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

    public Cuenta(Persona cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numeroCuenta = generarDigitos();
    }

    private String generarDigitos() {
        String digitos;
        String todosDigitos = "";

        do {
            int digito = ra.nextInt(9);
            digitos = Integer.toString(digito);

            todosDigitos += digitos;

        } while (todosDigitos.length() != 20);

        return todosDigitos;
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

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
}
