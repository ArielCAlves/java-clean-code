package org.example.model;

public final class Entrega {
    private final String endereco;
    private final double peso;
    private final TipoFrete tipoFrete;
    private final String destinatario;

    public Entrega(String endereco, double peso, TipoFrete tipoFrete, String destinatario) {
        if (endereco == null || endereco.isBlank()) throw new IllegalArgumentException("Endereço inválido");
        if (peso <= 0) throw new IllegalArgumentException("Peso deve ser positivo");
        if (tipoFrete == null) throw new IllegalArgumentException("Tipo de frete obrigatório");
        if (destinatario == null || destinatario.isBlank()) throw new IllegalArgumentException("Destinatário inválido");
        this.endereco = endereco;
        this.peso = peso;
        this.tipoFrete = tipoFrete;
        this.destinatario = destinatario;
    }

    public String getEndereco() { return endereco; }
    public double getPeso() { return peso; }
    public TipoFrete getTipoFrete() { return tipoFrete; }
    public String getDestinatario() { return destinatario; }
}
