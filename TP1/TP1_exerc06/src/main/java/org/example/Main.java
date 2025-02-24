package org.example;

import org.example.model.Cliente;
import org.example.repository.ClienteRepository;
import org.example.service.RelatorioFinanceiroService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        RelatorioFinanceiroService relatorioService = new RelatorioFinanceiroService(clienteRepository);

        clienteRepository.adicionarCliente(new Cliente("João", new BigDecimal("5000.00")));
        clienteRepository.adicionarCliente(new Cliente("Maria", new BigDecimal("2000.50")));

        relatorioService.gerarRelatorio();
    }
}
