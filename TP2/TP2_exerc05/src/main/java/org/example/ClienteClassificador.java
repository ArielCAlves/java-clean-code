package org.example;

public class ClienteClassificador {
    public String classificarCliente(Cliente cliente) {
        ClienteClassificacao estrategia = cliente.getIdade() > 60 ? new ClienteClassificacaoSenior() : new ClienteClassificacaoJovem();
        return estrategia.classificar(cliente);
    }
}
