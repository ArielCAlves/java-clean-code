package org.example.model;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Representa um pedido com um identificador, descrição e valor associado.
 */
public class Pedido {
    private final int identificador;
    private final String descricao;
    private final BigDecimal valorTotal;

    public Pedido(int identificador, String descricao, BigDecimal valorTotal) {
        if (identificador <= 0) {
            throw new IllegalArgumentException("O identificador deve ser maior que zero.");
        }
        this.identificador = identificador;
        this.descricao = Objects.requireNonNull(descricao, "A descrição não pode ser nula.");
        validarValor(valorTotal);
        this.valorTotal = valorTotal;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    private void validarValor(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor do pedido deve ser positivo.");
        }
    }
}
