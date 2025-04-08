package org.example.service;

import org.example.model.Entrega;
import org.example.model.TipoFrete;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreteExpressoTest {

    @Test
    void deveCalcularFreteExpressoParaGoku() {
        Entrega entrega = new Entrega("Capsule Corp", 4.0, TipoFrete.EXP, "Trunks");
        FreteExpresso frete = new FreteExpresso();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("16.0")));
    }

    @Test
    void deveCalcularFreteExpressoParaYusuke() {
        Entrega entrega = new Entrega("Distrito Sarayashiki", 6.0, TipoFrete.EXP, "Yusuke Urameshi");
        FreteExpresso frete = new FreteExpresso();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("19.0")));
    }
}
