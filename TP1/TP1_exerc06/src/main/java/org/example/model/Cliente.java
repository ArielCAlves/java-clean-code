package org.example.model;

import java.math.BigDecimal;

public class Cliente {
    private final String nome;
    private final BigDecimal saldo;

    public Cliente(String nome, BigDecimal saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() { return nome; }
    public BigDecimal getSaldo() { return saldo; }
}
