package org.example;

import org.example.repository.CarrinhoRepository;
import org.example.service.CarrinhoCalculadoraService;
import org.example.service.CarrinhoService;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CarrinhoRepository carrinhoRepository = new CarrinhoRepository();
        CarrinhoService carrinhoService = new CarrinhoService(carrinhoRepository);
        CarrinhoCalculadoraService calculadoraService = new CarrinhoCalculadoraService(carrinhoService);

        carrinhoService.adicionarProduto("Notebook", new BigDecimal("35000.00"), 1);
        carrinhoService.adicionarProduto("Mouse", new BigDecimal("500.00"), 2);
        carrinhoService.adicionarProduto("Teclado", new BigDecimal("1800.00"), 1);

        calculadoraService.exibirTotal();
    }
}
