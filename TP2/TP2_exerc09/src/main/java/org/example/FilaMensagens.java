package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class FilaMensagens {
    private final Queue<String> mensagens = new LinkedList<>();

    public String visualizarProximaMensagem() {
        return mensagens.peek(); // Retorna sem remover
    }

    public String obterProximaMensagem() {
        if (mensagens.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return mensagens.poll(); // Retorna e remove
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    public boolean temMensagens() {
        return !mensagens.isEmpty();
    }
}
