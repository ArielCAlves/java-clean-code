package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Desconto desconto = new Desconto();

        BigDecimal precoProduto1 = new BigDecimal("2000");
        BigDecimal precoProduto2 = new BigDecimal("900");
        BigDecimal precoProduto3 = new BigDecimal("1000");

        System.out.println("Preço original: R$" + precoProduto1 + " | Com desconto: R$" + desconto.calcular(precoProduto1));
        System.out.println("Preço original: R$" + precoProduto2 + " | Com desconto: R$" + desconto.calcular(precoProduto2));
        System.out.println("Preço original: R$" + precoProduto3 + " | Com desconto: R$" + desconto.calcular(precoProduto3));
    }
}
