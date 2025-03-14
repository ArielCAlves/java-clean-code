package org.example;

public class RelatorioJson implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando cabeçalho do JSON...");
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando corpo do JSON...");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando rodapé do JSON...");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório em JSON...");
        gerarCabecalho();
        gerarCorpo();
        gerarRodape();
    }
}
