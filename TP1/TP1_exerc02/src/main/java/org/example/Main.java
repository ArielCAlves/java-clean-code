package org.example;

import org.example.service.ProcessadorService;

public class Main {
    public static void main(String[] args) {
        ProcessadorService processador = new ProcessadorService();

        processador.processar("Exemplo de dado válido");
        processador.processar("Curto");
        processador.processar("");
        processador.processar(null);
    }
}
