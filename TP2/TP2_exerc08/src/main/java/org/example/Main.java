package org.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);

        double valorCompra = 60;

        if (conta.temSaldoSuficiente(valorCompra)) {
            conta.debitar(valorCompra);
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para a compra.");
        }

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
