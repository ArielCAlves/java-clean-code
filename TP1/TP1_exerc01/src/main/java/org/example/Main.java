package org.example;

import org.example.repository.ContaRepository;
import org.example.service.ContaRelatorioService;
import org.example.service.ContaService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaRepository contaRepository = new ContaRepository();
        ContaService contaService = new ContaService(contaRepository);
        ContaRelatorioService relatorioService = new ContaRelatorioService(contaService);

        contaService.adicionarConta("Conta1", new BigDecimal("1000.00"));
        contaService.adicionarConta("Conta2", new BigDecimal("500.00"));

        relatorioService.gerarRelatorio();
        contaService.processarPagamentos(new BigDecimal("50.00"));
        relatorioService.gerarRelatorio();
    }
}
