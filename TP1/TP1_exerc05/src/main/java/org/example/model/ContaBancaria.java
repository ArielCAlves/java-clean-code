package org.example.model;

import java.math.BigDecimal;

public class ContaBancaria {
    private final String titular;
    private BigDecimal saldo;

    public ContaBancaria(String titular, BigDecimal saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() { return titular; }
    public BigDecimal getSaldo() { return saldo; }

    public boolean podeTransferir(BigDecimal valor) {
        return saldo.compareTo(valor) >= 0;
    }

    public void sacar(BigDecimal valor) {
        if (podeTransferir(valor)) {
            saldo = saldo.subtract(valor);
        }
    }

    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }
}
