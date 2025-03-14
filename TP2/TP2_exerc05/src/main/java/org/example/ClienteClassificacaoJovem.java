package org.example;

public class ClienteClassificacaoJovem implements ClienteClassificacao {
    @Override
    public String classificar(Cliente cliente) {
        if (cliente.getRenda() > 7000) {
            return cliente.getCompras() > 20 ? "Cliente Premium Jovem" : "Cliente Regular Jovem";
        }
        return "Cliente Jovem Baixa Renda";
    }
}
