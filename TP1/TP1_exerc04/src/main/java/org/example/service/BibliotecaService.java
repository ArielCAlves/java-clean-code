package org.example.service;

import org.example.interfaces.BibliotecaServiceInterface;
import org.example.model.Livro;
import org.example.repository.BibliotecaRepository;

import java.util.Optional;

public class BibliotecaService implements BibliotecaServiceInterface {
    private final BibliotecaRepository bibliotecaRepository;

    public BibliotecaService(BibliotecaRepository bibliotecaRepository) {
        this.bibliotecaRepository = bibliotecaRepository;
    }

    @Override
    public void adicionarLivro(String titulo) {
        bibliotecaRepository.adicionarLivro(new Livro(titulo));
    }

    @Override
    public void emprestarLivro(String titulo) {
        Optional<Livro> livro = bibliotecaRepository.buscarLivro(titulo);
        if (livro.isPresent() && livro.get().isDisponivel()) {
            livro.get().emprestar();
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro não disponível.");
        }
    }

    @Override
    public void devolverLivro(String titulo) {
        Optional<Livro> livro = bibliotecaRepository.buscarLivro(titulo);
        if (livro.isPresent()) {
            livro.get().devolver();
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
