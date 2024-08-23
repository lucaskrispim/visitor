package org.example;

public class Particula implements EntidadeFisica {

    private int id;
    private String nome;
    private ParticulaTipo tipo;

    public Particula(int id, String nome, ParticulaTipo tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ParticulaTipo getTipo() {
        return tipo;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirParticula(this);
    }
}
