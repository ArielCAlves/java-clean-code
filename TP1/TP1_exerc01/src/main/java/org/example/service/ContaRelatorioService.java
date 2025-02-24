package org.example.service;

import org.example.interfaces.ContaServiceInterface;
import org.example.utils.RelatorioFinanceiro;

public class ContaRelatorioService {
    private final ContaServiceInterface contaService;

    public ContaRelatorioService(ContaServiceInterface contaService) {
        this.contaService = contaService;
    }

    public void gerarRelatorio() {
        RelatorioFinanceiro.gerar(contaService.listarContas());
    }
}
