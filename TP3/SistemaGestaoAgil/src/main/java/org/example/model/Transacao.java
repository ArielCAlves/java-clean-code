package org.example.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class Transacao {
    private final String id;
    private final LocalDateTime data;
    private final List<Item> itens;
    private final Status status;

    public Transacao(List<Item> itens, Status status) {
        this.id = UUID.randomUUID().toString();
        this.data = LocalDateTime.now();
        this.itens = List.copyOf(itens);
        this.status = status;
    }

    private Transacao(String id, LocalDateTime data, List<Item> itens, Status status) {
        this.id = id;
        this.data = data;
        this.itens = itens;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public Status getStatus() {
        return status;
    }

    public BigDecimal getValorTotal() {
        return itens.stream()
                .map(Item::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Transacao atualizarStatus(Status novoStatus) {
        return new Transacao(this.id, this.data, this.itens, novoStatus);
    }
}
