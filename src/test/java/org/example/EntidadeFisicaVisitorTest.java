package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntidadeFisicaVisitorTest {

    @Test
    void deveExibirParticula() {
        ParticulaTipo fermion = new ParticulaTipo("Fermion", "Negativa", 9.11e-31);
        Particula particula = new Particula(1, "Elétron", fermion);

        EntidadeFisicaVisitor visitor = new EntidadeFisicaVisitor();
        assertEquals("Particula{id=1, nome='Elétron', tipo='Fermion', carga='Negativa', massa=9.11E-31}", visitor.exibir(particula));
    }

    @Test
    void deveExibirForca() {
        Forca forca = new Forca(9, "Norte", "Magnética");

        EntidadeFisicaVisitor visitor = new EntidadeFisicaVisitor();
        assertEquals("Forca{intensidade=9, direcao='Norte', tipo='Magnética'}", visitor.exibir(forca));
    }

    @Test
    void deveExibirCampo() {
        Campo campo = new Campo("Elétrico", 500.0);

        EntidadeFisicaVisitor visitor = new EntidadeFisicaVisitor();
        assertEquals("Campo{tipo='Elétrico', intensidade=500.0}", visitor.exibir(campo));
    }

}