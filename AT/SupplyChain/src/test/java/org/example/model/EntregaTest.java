package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void deveCriarEntregaValida() {
        Entrega entrega = new Entrega("Planeta Namekusei", 5.0, TipoFrete.PAD, "Kakarotto");
        assertEquals("Planeta Namekusei", entrega.getEndereco());
        assertEquals(5.0, entrega.getPeso());
        assertEquals(TipoFrete.PAD, entrega.getTipoFrete());
        assertEquals("Kakarotto", entrega.getDestinatario());
    }

    @Test
    void deveLancarExcecaoParaEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("", 5.0, TipoFrete.PAD, "Kakarotto")
        );

        assertThrows(IllegalArgumentException.class, () ->
                new Entrega(null, 5.0, TipoFrete.PAD, "Kakarotto")
        );
    }

    @Test
    void deveLancarExcecaoParaPesoInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("Planeta Namekusei", 0, TipoFrete.PAD, "Kakarotto")
        );

        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("Planeta Namekusei", -10, TipoFrete.PAD, "Kakarotto")
        );
    }

    @Test
    void deveLancarExcecaoParaTipoFreteNulo() {
        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("Planeta Namekusei", 5.0, null, "Kakarotto")
        );
    }

    @Test
    void deveLancarExcecaoParaDestinatarioInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("Planeta Namekusei", 5.0, TipoFrete.PAD, "")
        );

        assertThrows(IllegalArgumentException.class, () ->
                new Entrega("Planeta Namekusei", 5.0, TipoFrete.PAD, null)
        );
    }
}