package org.example.model;

import java.math.BigDecimal;
import java.util.Objects;

public final class Item {
    private final String codigo;
    private final int quantidade;
    private final BigDecimal valorUnitario;

    public Item(String codigo, int quantidade, BigDecimal valorUnitario) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código do item não pode ser vazio.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        if (valorUnitario == null || valorUnitario.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo.");
        }
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    public Item atualizarQuantidade(int novaQuantidade) {
        return new Item(this.codigo, novaQuantidade, this.valorUnitario);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return codigo.equals(item.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
