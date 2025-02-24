package org.example;

/**
 * Processa valores de entrada.
 */
public class Processador {

    /**
     * Além de executar garante que não seja nulo.
     *
     * @param valor Input a ser processado.
     */
    public void executar(String valor) {
        if (valor == null || valor.isBlank()) {
            System.out.println("Entrada inválida.");
            return;
        }

        System.out.println("Processando: " + valor);
    }
}
