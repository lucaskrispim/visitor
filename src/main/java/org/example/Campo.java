package org.example;

public class Campo implements EntidadeFisica {

    private String tipo;
    private double intensidade;

    public Campo(String tipo, double intensidade) {
        this.tipo = tipo;
        this.intensidade = intensidade;
    }

    public String getTipo() {
        return tipo;
    }

    public double getIntensidade() {
        return intensidade;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCampo(this);
    }
}
