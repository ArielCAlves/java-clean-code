package org.example.service;

import org.example.interfaces.RelatorioFinanceiroInterface;
import org.example.model.Cliente;
import org.example.repository.ClienteRepository;
import org.example.utils.FormatadorMonetario;

import java.util.List;

public class RelatorioFinanceiroService implements RelatorioFinanceiroInterface {
    private final ClienteRepository clienteRepository;

    public RelatorioFinanceiroService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public void gerarRelatorio() {
        List<Cliente> clientes = clienteRepository.listarClientes();
        System.out.println("=== Relatório Financeiro ===");
        clientes.forEach(cliente ->
                System.out.println("Cliente: " + cliente.getNome() + " - Saldo: " + FormatadorMonetario.formatar(cliente.getSaldo()))
        );
        System.out.println("===========================");
        System.out.println("Fim do Relatório");
    }
}
