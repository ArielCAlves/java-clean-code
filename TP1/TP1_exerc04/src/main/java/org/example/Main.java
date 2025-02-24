package org.example;

import org.example.repository.BibliotecaRepository;
import org.example.service.BibliotecaService;

public class Main {
    public static void main(String[] args) {
        BibliotecaRepository bibliotecaRepository = new BibliotecaRepository();
        BibliotecaService bibliotecaService = new BibliotecaService(bibliotecaRepository);

        bibliotecaService.adicionarLivro("Musashi");
        bibliotecaService.adicionarLivro("Vampiro: A Máscara");

        bibliotecaService.emprestarLivro("Musashi");
        bibliotecaService.emprestarLivro("Musashi");

        bibliotecaService.devolverLivro("Musashi");
        bibliotecaService.emprestarLivro("Musashi");
    }
}
