package org.example;

public class ClienteClassificacaoSenior implements ClienteClassificacao {
    @Override
    public String classificar(Cliente cliente) {
        if (cliente.getRenda() > 5000) {
            return cliente.getCompras() > 10 ? "Cliente Premium Sênior" : "Cliente Regular Sênior";
        }
        return "Cliente Sênior Baixa Renda";
    }
}
