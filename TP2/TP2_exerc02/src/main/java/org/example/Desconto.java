package org.example;
import java.math.BigDecimal;

public class Desconto {
    private static final BigDecimal LIMITE_DESCONTO = new BigDecimal("1000");
    private static final BigDecimal PERCENTUAL_DESCONTO = new BigDecimal("0.90");

    public BigDecimal calcular(BigDecimal preco) {
        if (preco.compareTo(LIMITE_DESCONTO) >= 0) {
            return preco.multiply(PERCENTUAL_DESCONTO);
        }
        return preco;
    }
}