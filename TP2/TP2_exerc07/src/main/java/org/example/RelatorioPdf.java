package org.example;

public class RelatorioPdf implements Relatorio {
    @Override
    public void gerarCabecalho() {
        System.out.println("Gerando cabeçalho do PDF...");
    }

    @Override
    public void gerarCorpo() {
        System.out.println("Gerando corpo do PDF...");
    }

    @Override
    public void gerarRodape() {
        System.out.println("Gerando rodapé do PDF...");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório em PDF...");
        gerarCabecalho();
        gerarCorpo();
        gerarRodape();
    }
}
