package org.example.service;

import org.example.interfaces.ContaServiceInterface;
import org.example.model.Conta;
import org.example.repository.ContaRepository;
import java.math.BigDecimal;
import java.util.List;

public class ContaService implements ContaServiceInterface {
    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public void adicionarConta(String nome, BigDecimal saldoInicial) {
        contaRepository.adicionar(new Conta(nome, saldoInicial));
    }

    @Override
    public void processarPagamentos(BigDecimal taxa) {
        for (Conta conta : contaRepository.listar()) {
            conta.debitar(taxa);
        }
    }

    @Override
    public List<Conta> listarContas() {
        return contaRepository.listar();
    }
}
