package org.example;

public class RelatorioService {
    public void gerarRelatorio(TipoRelatorio tipo) {
        Relatorio relatorio = RelatorioFactory.criarRelatorio(tipo);
        relatorio.gerar();
    }
}
