package org.example;

public class Main {
    public static void main(String[] args) {
        Monitoramento monitoramento = new Monitoramento();

        System.out.println("Acesso inicial: " + monitoramento.getContadorAcessos());

        monitoramento.incrementarAcessos();
        monitoramento.incrementarAcessos();

        System.out.println("Após dois acessos: " + monitoramento.getContadorAcessos());
    }
}
