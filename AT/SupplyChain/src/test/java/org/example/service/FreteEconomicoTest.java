package org.example.service;

import org.example.model.Entrega;
import org.example.model.TipoFrete;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreteEconomicoTest {

    @Test
    void deveCalcularFreteEconomicoParaGenkai() {
        Entrega entrega = new Entrega("Monte Paozu", 5.0, TipoFrete.ECO, "Mestra Genkai");
        FreteEconomico frete = new FreteEconomico();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("0.5")));
    }

    @Test
    void deveCalcularFreteEconomicoParaKuririn() {
        Entrega entrega = new Entrega("Templo Sagrado", 10.0, TipoFrete.ECO, "Kuririn");
        FreteEconomico frete = new FreteEconomico();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("6.0")));
    }

    @Test
    void deveCalcularFreteEconomicoParaPesoDecimal() {
        Entrega entrega = new Entrega("Planeta Kaio", 3.5, TipoFrete.ECO, "Sr. Kaio");
        FreteEconomico frete = new FreteEconomico();
        BigDecimal valor = frete.calcular(entrega);
        assertEquals(0, valor.compareTo(new BigDecimal("-1.15")));
    }
}
