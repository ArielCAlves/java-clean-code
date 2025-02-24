package org.example.repository;

import org.example.model.ItemCarrinho;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoRepository {
    private final List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionar(ItemCarrinho item) {
        itens.add(item);
    }

    public List<ItemCarrinho> listarItens() {
        return new ArrayList<>(itens);
    }
}
