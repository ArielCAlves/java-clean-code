package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
    private final List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public Optional<ContaBancaria> buscarConta(String titular) {
        return contas.stream().filter(c -> c.getTitular().equalsIgnoreCase(titular)).findFirst();
    }
}
