package org.example;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean temSaldoSuficiente(double valor) {
        return saldo >= valor;
    }

    public void debitar(double valor) {
        if (temSaldoSuficiente(valor) == false) {
            throw new IllegalArgumentException("Saldo insuficiente para a compra.");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
