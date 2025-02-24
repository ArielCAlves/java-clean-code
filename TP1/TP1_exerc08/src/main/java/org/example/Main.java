package org.example;

import org.example.model.Pedido;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Pedido pedido1 = new Pedido(1, "Notebook", new BigDecimal("3500.00"));
            System.out.println("Pedido criado: " + pedido1.getDescricao() + " - Valor: " + pedido1.getValorTotal());

            Pedido pedidoInvalido = new Pedido(0, "Celular", new BigDecimal("-1000.00")); // Deve lançar exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
