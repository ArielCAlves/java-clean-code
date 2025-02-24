package org.example.interfaces;

import org.example.model.Conta;
import java.math.BigDecimal;
import java.util.List;

public interface ContaServiceInterface {
    void adicionarConta(String nome, BigDecimal saldoInicial);
    void processarPagamentos(BigDecimal taxa);
    List<Conta> listarContas();
}
