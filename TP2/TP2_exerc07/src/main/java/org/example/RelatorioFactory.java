package org.example;

public class RelatorioFactory {
    public static Relatorio criarRelatorio(TipoRelatorio tipo) {
        return switch (tipo) {
            case PDF -> new RelatorioPdf();
            case CSV -> new RelatorioCsv();
            case JSON -> new RelatorioJson();
        };
    }
}
