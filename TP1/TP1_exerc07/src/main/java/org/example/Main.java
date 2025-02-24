package org.example;

import org.example.exceptions.SaldoInsuficienteException;
import org.example.exceptions.ValorInvalidoException;
import org.example.model.ContaBancaria;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            ContaBancaria conta = new ContaBancaria("João", new BigDecimal("1000.00"));

            conta.depositar(new BigDecimal("500.00"));
            System.out.println("Saldo após depósito: " + conta.getSaldo());

            conta.sacar(new BigDecimal("300.00"));
            System.out.println("Saldo após saque: " + conta.getSaldo());

            conta.sacar(new BigDecimal("2000.00")); // Espero uma exceção

        } catch (ValorInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
