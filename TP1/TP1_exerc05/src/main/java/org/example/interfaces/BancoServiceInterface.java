package org.example.interfaces;

import java.math.BigDecimal;

public interface BancoServiceInterface {
    void criarConta(String titular, BigDecimal saldoInicial);
    void transferir(String origem, String destino, BigDecimal valor);
}
