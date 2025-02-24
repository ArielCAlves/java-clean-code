package org.example.interfaces;

public interface BibliotecaServiceInterface {
    void adicionarLivro(String titulo);
    void emprestarLivro(String titulo);
    void devolverLivro(String titulo);
}
