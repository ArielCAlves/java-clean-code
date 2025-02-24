package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private final List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Optional<Livro> buscarLivro(String titulo) {
        return livros.stream().filter(l -> l.getTitulo().equalsIgnoreCase(titulo)).findFirst();
    }

    public List<Livro> listarLivros() {
        return new ArrayList<>(livros);
    }
}
