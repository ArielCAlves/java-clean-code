package org.example;

public class PedidoService {
    public void atualizarStatus(StatusPedido status) {
        switch (status) {
            case PENDENTE -> System.out.println("O pedido está pendente.");
            case PROCESSANDO -> System.out.println("O pedido está sendo processado.");
            case ENVIADO -> System.out.println("O pedido foi enviado.");
            case ENTREGUE -> System.out.println("O pedido foi entregue.");
        }
    }
}
