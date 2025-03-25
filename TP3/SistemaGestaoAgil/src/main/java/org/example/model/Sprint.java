package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
    private String nome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Task> tarefas = new ArrayList<>();

    public Sprint(String nome, LocalDate dataInicio, LocalDate dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void adicionarTarefa(Task tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Task tarefa) {
        tarefas.remove(tarefa);
    }

    public List<Task> listarTarefas() {
        return new ArrayList<>(tarefas);
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
}
