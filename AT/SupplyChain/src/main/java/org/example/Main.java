package org.example;

import org.example.model.Entrega;
import org.example.model.TipoFrete;
import org.example.service.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Entrega entrega = new Entrega(
                "Planeta Namekusei, 123",
                8.5,
                TipoFrete.EXP,
                "Kakarotto"
        );

        Map<String, CalculadoraFrete> estrategias = Map.of(
                "EXP", new FreteExpresso(),
                "PAD", new FretePadrao(),
                "ECO", new FreteEconomico()
        );

        EtiquetaService etiquetaService = new EtiquetaService(estrategias);

        System.out.println(etiquetaService.gerarEtiqueta(entrega));
        System.out.println("---------------------------");
        System.out.println(etiquetaService.gerarResumo(entrega));
    }
}
