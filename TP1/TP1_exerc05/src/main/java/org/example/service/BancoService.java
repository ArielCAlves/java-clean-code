package org.example.service;

import org.example.interfaces.BancoServiceInterface;
import org.example.model.ContaBancaria;
import org.example.repository.BancoRepository;

import java.math.BigDecimal;
import java.util.Optional;

public class BancoService implements BancoServiceInterface {
    private final BancoRepository bancoRepository;

    public BancoService(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    @Override
    public void criarConta(String titular, BigDecimal saldoInicial) {
        bancoRepository.criarConta(titular, saldoInicial);
    }

    @Override
    public void transferir(String origem, String destino, BigDecimal valor) {
        Optional<ContaBancaria> contaOrigem = bancoRepository.buscarConta(origem);
        Optional<ContaBancaria> contaDestino = bancoRepository.buscarConta(destino);

        if (contaOrigem.isPresent() && contaDestino.isPresent() && contaOrigem.get().podeTransferir(valor)) {
            contaOrigem.get().sacar(valor);
            contaDestino.get().depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Erro na transferência.");
        }
    }
}
