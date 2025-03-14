package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(65, 6000, 15);
        Cliente cliente2 = new Cliente(30, 8000, 25);
        Cliente cliente3 = new Cliente(70, 4000, 5);
        Cliente cliente4 = new Cliente(25, 6000, 10);

        ClienteClassificador classificador = new ClienteClassificador();

        System.out.println("Cliente 1: " + classificador.classificarCliente(cliente1));
        System.out.println("Cliente 2: " + classificador.classificarCliente(cliente2));
        System.out.println("Cliente 3: " + classificador.classificarCliente(cliente3));
        System.out.println("Cliente 4: " + classificador.classificarCliente(cliente4));
    }
}
