package org.example.repository;

import org.example.model.Biblioteca;
import org.example.model.Livro;

import java.util.Optional;

public class BibliotecaRepository {
    private final Biblioteca biblioteca;

    public BibliotecaRepository() {
        this.biblioteca = new Biblioteca();
    }

    public void adicionarLivro(Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    public Optional<Livro> buscarLivro(String titulo) {
        return biblioteca.buscarLivro(titulo);
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}
