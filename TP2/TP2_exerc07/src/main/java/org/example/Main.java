package org.example;

public class Main {
    public static void main(String[] args) {
        RelatorioService relatorioService = new RelatorioService();

        relatorioService.gerarRelatorio(TipoRelatorio.PDF);
        relatorioService.gerarRelatorio(TipoRelatorio.CSV);
        relatorioService.gerarRelatorio(TipoRelatorio.JSON);
    }
}
