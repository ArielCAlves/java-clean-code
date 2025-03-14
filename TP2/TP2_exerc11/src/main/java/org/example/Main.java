package org.example;

public class Main {
    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoService();

        pedidoService.atualizarStatus(StatusPedido.PENDENTE);
        pedidoService.atualizarStatus(StatusPedido.PROCESSANDO);
        pedidoService.atualizarStatus(StatusPedido.ENVIADO);
        pedidoService.atualizarStatus(StatusPedido.ENTREGUE);
    }
}
