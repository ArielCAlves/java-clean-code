package org.example.model;

public class Task {
    private String titulo;
    private String descricao;
    private Status status;
    private User responsavel;

    public Task(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.TODO;
    }

    public void atribuirResponsavel(User user) {
        this.responsavel = user;
    }

    public void alterarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Status: " + status);
        System.out.println("Responsável: " + (responsavel != null ? responsavel.getNome() : "Nenhum"));
    }

    public Status getStatus() {
        return status;
    }

    public String getTitulo() {
        return titulo;
    }
}
