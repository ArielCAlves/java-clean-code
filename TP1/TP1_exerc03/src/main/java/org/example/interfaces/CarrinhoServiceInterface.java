package org.example.interfaces;

import java.math.BigDecimal;

public interface CarrinhoServiceInterface {
    void adicionarProduto(String nome, BigDecimal preco, int quantidade);
    BigDecimal calcularTotal();
}
