package org.example.service;

import org.example.interfaces.CarrinhoServiceInterface;
import org.example.utils.FormatadorPreco;
import java.math.BigDecimal;

public class CarrinhoCalculadoraService {
    private final CarrinhoServiceInterface carrinhoService;

    public CarrinhoCalculadoraService(CarrinhoServiceInterface carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    public void exibirTotal() {
        BigDecimal total = carrinhoService.calcularTotal();
        System.out.println("Total da compra: " + FormatadorPreco.formatar(total));
    }
}
