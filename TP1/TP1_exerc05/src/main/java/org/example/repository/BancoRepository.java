package org.example.repository;

import org.example.model.Banco;
import org.example.model.ContaBancaria;

import java.math.BigDecimal;
import java.util.Optional;

public class BancoRepository {
    private final Banco banco;

    public BancoRepository() {
        this.banco = new Banco();
    }

    public void criarConta(String titular, BigDecimal saldoInicial) {
        banco.adicionarConta(new ContaBancaria(titular, saldoInicial));
    }

    public Optional<ContaBancaria> buscarConta(String titular) {
        return banco.buscarConta(titular);
    }
}
