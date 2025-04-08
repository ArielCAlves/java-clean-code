package org.example.service;

import org.example.model.Entrega;

import java.math.BigDecimal;

public class FreteEconomico implements CalculadoraFrete {
    public BigDecimal calcular(Entrega entrega) {
        return BigDecimal.valueOf(entrega.getPeso()).multiply(BigDecimal.valueOf(1.1)).subtract(BigDecimal.valueOf(5));
    }
}
