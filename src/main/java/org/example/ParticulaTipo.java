package org.example;

public class ParticulaTipo {

    private String nomeTipo;
    private String carga;
    private double massa;

    public ParticulaTipo(String nomeTipo, String carga, double massa) {
        this.nomeTipo = nomeTipo;
        this.carga = carga;
        this.massa = massa;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public String getCarga() {
        return carga;
    }

    public double getMassa() {
        return massa;
    }
}