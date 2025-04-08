package org.example.service;

import org.example.model.Entrega;
import org.example.model.TipoFrete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EtiquetaServiceTest {

    private EtiquetaService etiquetaService;

    @BeforeEach
    void setUp() {
        etiquetaService = new EtiquetaService(Map.of(
                "EXP", new FreteExpresso(),
                "PAD", new FretePadrao(),
                "ECO", new FreteEconomico()
        ));
    }

    @Test
    void deveGerarEtiquetaParaKuririn() {
        Entrega entrega = new Entrega("Capsule Corp", 2.0, TipoFrete.PAD, "Kuririn");
        String etiqueta = etiquetaService.gerarEtiqueta(entrega);
        assertTrue(etiqueta.contains("Kuririn"));
        assertTrue(etiqueta.contains("Capsule Corp"));
        assertTrue(etiqueta.contains("R$2.4"));
    }

    @Test
    void deveGerarResumoParaHiei() {
        Entrega entrega = new Entrega("Makai", 3.0, TipoFrete.EXP, "Hiei");
        String resumo = etiquetaService.gerarResumo(entrega);
        assertTrue(resumo.contains("Hiei"));
        assertTrue(resumo.contains("EXP"));
        assertTrue(resumo.contains("R$14.5"));
    }

    @Test
    void deveLancarExcecaoParaFreteNaoSuportadoPorYusuke() {
        EtiquetaService serviceComVazio = new EtiquetaService(Map.of());
        Entrega entrega = new Entrega("Mundo Espiritual", 1.0, TipoFrete.EXP, "Yusuke Urameshi");
        assertThrows(IllegalArgumentException.class, () ->
                serviceComVazio.gerarEtiqueta(entrega));
    }
}