package org.example;

import java.math.BigDecimal;

public class Ajuste {

    public Produto aplicarDesconto(Produto produto, BigDecimal desconto) {
        validarDesconto(desconto);
        BigDecimal novoPreco = produto.getPreco().subtract(desconto);
        return new Produto(produto.getNome(), novoPreco);
    }

    private void validarDesconto(BigDecimal desconto) {
        if (desconto == null || desconto.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O desconto não pode ser negativo.");
        }
    }
}
