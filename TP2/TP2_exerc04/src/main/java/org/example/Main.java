package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Produto produtoOriginal = new Produto("Notebook", new BigDecimal("39000.00"));
        Ajuste ajuste = new Ajuste();

        Produto produtoComDesconto = ajuste.aplicarDesconto(produtoOriginal, new BigDecimal("2000.00"));

        System.out.println("Produto original: " + produtoOriginal.getNome() + " - Preço: R$" + produtoOriginal.getPreco());
        System.out.println("Produto com desconto: " + produtoComDesconto.getNome() + " - Preço: R$" + produtoComDesconto.getPreco());
    }
}
