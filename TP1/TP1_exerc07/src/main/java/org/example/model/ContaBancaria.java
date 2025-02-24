package org.example.model;

import org.example.exceptions.SaldoInsuficienteException;
import org.example.exceptions.ValorInvalidoException;
import java.math.BigDecimal;
import java.util.Objects;

public class ContaBancaria {
    private final String titular;
    private BigDecimal saldo;

    public ContaBancaria(String titular, BigDecimal saldoInicial) {
        Objects.requireNonNull(titular, "Titular não pode ser nulo.");
        if (saldoInicial.compareTo(BigDecimal.ZERO) < 0) {
            throw new ValorInvalidoException("Saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(BigDecimal valor) {
        validarValor(valor);
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        validarValor(valor);
        if (saldo.compareTo(valor) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        }
        saldo = saldo.subtract(valor);
    }

    private void validarValor(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new ValorInvalidoException("O valor deve ser positivo.");
        }
    }
}
