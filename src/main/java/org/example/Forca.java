package org.example;

public class Forca implements EntidadeFisica {

    private int magnitude;
    private String direcao;
    private String tipo;

    public Forca(int magnitude, String direcao, String tipo) {
        this.magnitude = magnitude;
        this.direcao = direcao;
        this.tipo = tipo;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public String getDirecao() {
        return direcao;
    }

    public String getTipo() {
        return tipo;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirForca(this);
    }

}
