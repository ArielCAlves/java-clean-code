package org.example.service;

import org.example.model.Project;
import org.example.model.Sprint;

public class ProjetoService {
    public void exibirResumoProjeto(Project projeto) {
        System.out.println("Projeto: " + projeto.getNome());
        System.out.println("Descrição: " + projeto.getDescricao());
        System.out.println("Sprints:");
        for (Sprint sprint : projeto.listarSprints()) {
            System.out.println("- " + sprint.getNome());
        }
    }
}