package org.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RegistroOperacao {
    private final String id;
    private final TipoOperacao tipo;
    private final BigDecimal valor;
    private final int quantidade;
    private final LocalDateTime criadoEm;

    public RegistroOperacao(String id, TipoOperacao tipo, BigDecimal valor, int quantidade, LocalDateTime criadoEm) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.quantidade = quantidade;
        this.criadoEm = criadoEm;
    }

    public String getId() {
        return id;
    }

    public TipoOperacao getTipo() {
        return tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }
}
