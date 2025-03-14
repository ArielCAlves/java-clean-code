package org.example;

public class Cliente {
    private final int idade;
    private final double renda;
    private final int compras;

    public Cliente(int idade, double renda, int compras) {
        this.idade = idade;
        this.renda = renda;
        this.compras = compras;
    }

    public int getIdade() {
        return idade;
    }

    public double getRenda() {
        return renda;
    }

    public int getCompras() {
        return compras;
    }
}