package org.example.service;

import org.example.model.Entrega;
import java.math.BigDecimal;

public interface CalculadoraFrete {
    BigDecimal calcular(Entrega entrega);
}
