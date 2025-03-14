package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente clienteCadastrado = new Cliente("Yusuke Urameshi");
        Pedido pedidoComCliente = new Pedido(clienteCadastrado);
        System.out.println("Pedido de: " + pedidoComCliente.getNomeCliente());

        Pedido pedidoSemCliente = new Pedido(null);
        System.out.println("Pedido de: " + pedidoSemCliente.getNomeCliente());
    }
}