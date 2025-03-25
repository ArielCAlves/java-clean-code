package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String nome;
    private String descricao;
    private List<Sprint> sprints = new ArrayList<>();

    public Project(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarSprint(Sprint sprint) {
        sprints.add(sprint);
    }

    public void removerSprint(Sprint sprint) {
        sprints.remove(sprint);
    }

    public List<Sprint> listarSprints() {
        return new ArrayList<>(sprints);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
