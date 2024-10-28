package weg.arquiteturaSoftware.TDD;

public class BancAccount {

    private double saldo;

    public BancAccount() {
        this.saldo = 0;
    }

    public double Depositar(double valor) {
        this.saldo += valor;
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
