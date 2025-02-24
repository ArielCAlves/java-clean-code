package org.example.service;

import org.example.interfaces.CarrinhoServiceInterface;
import org.example.model.ItemCarrinho;
import org.example.model.Produto;
import org.example.repository.CarrinhoRepository;
import java.math.BigDecimal;

public class CarrinhoService implements CarrinhoServiceInterface {
    private final CarrinhoRepository carrinhoRepository;

    public CarrinhoService(CarrinhoRepository carrinhoRepository) {
        this.carrinhoRepository = carrinhoRepository;
    }

    @Override
    public void adicionarProduto(String nome, BigDecimal preco, int quantidade) {
        Produto produto = new Produto(nome, preco);
        ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        carrinhoRepository.adicionar(item);
    }

    @Override
    public BigDecimal calcularTotal() {
        return carrinhoRepository.listarItens().stream()
                .map(ItemCarrinho::calcularSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
