package org.example.service;

import org.example.model.Entrega;

import java.math.BigDecimal;
import java.util.Map;

public class EtiquetaService {
    private final Map<String, CalculadoraFrete> estrategias;

    public EtiquetaService(Map<String, CalculadoraFrete> estrategias) {
        this.estrategias = estrategias;
    }

    public String gerarEtiqueta(Entrega entrega) {
        BigDecimal frete = calcularFrete(entrega);
        return "Destinatário: " + entrega.getDestinatario() +
                "\nEndereço: " + entrega.getEndereco() +
                "\nValor do Frete: R$" + frete;
    }

    public String gerarResumo(Entrega entrega) {
        BigDecimal frete = calcularFrete(entrega);
        return "Pedido para " + entrega.getDestinatario() +
                " com frete tipo " + entrega.getTipoFrete() +
                " no valor de R$" + frete;
    }

    private BigDecimal calcularFrete(Entrega entrega) {
        CalculadoraFrete estrategia = estrategias.get(entrega.getTipoFrete().name());
        if (estrategia == null) {
            throw new IllegalArgumentException("Tipo de frete não suportado: " + entrega.getTipoFrete());
        }
        return estrategia.calcular(entrega);
    }
}
