package org.example.utils;

import org.example.model.Conta;
import java.util.List;

public class RelatorioFinanceiro {
    public static void gerar(List<Conta> contas) {
        System.out.println("=== Relatório Financeiro ===");
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNome() + " - Saldo: " + conta.getSaldo());
        }
    }
}
