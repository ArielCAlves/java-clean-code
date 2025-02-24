package org.example;

public class Servico {

    public void processar(String dado) {
        validarEntrada(dado);
        System.out.println("Processando: " + dado.toUpperCase());
    }

    private void validarEntrada(String dado) {
        if (dado == null || dado.isBlank()) {
            throw new IllegalArgumentException("Entrada inválida: o dado não pode ser nulo nem vazio.");
        }
    }
}
