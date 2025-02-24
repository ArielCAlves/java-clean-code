package org.example.model;

import java.math.BigDecimal;

public class Conta {
    private String nome;
    private BigDecimal saldo;

    public Conta(String nome, BigDecimal saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }

    public String getNome() { return nome; }
    public BigDecimal getSaldo() { return saldo; }
    public void debitar(BigDecimal valor) { saldo = saldo.subtract(valor); }
}
