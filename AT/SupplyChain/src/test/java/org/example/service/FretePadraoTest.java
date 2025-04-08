package org.example.service;

import org.example.model.Entrega;
import org.example.model.TipoFrete;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FretePadraoTest {

    @Test
    void deveCalcularFretePadraoParaToguro() {
        Entrega entrega = new Entrega("Torre do Torneio das Trevas", 5.0, TipoFrete.PAD, "Toguro");
        FretePadrao frete = new FretePadrao();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("6.0")));
    }

    @Test
    void deveCalcularFretePadraoParaBulma() {
        Entrega entrega = new Entrega("Cidade do Oeste", 3.0, TipoFrete.PAD, "Bulma");
        FretePadrao frete = new FretePadrao();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("3.6")));
    }
}
