package org.example.repository;

import org.example.model.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
    private final List<Conta> contas = new ArrayList<>();

    public void adicionar(Conta conta) { contas.add(conta); }
    public List<Conta> listar() { return contas; }
}
