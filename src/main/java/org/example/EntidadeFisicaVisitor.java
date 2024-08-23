package org.example;

public class EntidadeFisicaVisitor implements Visitor {

    public String exibir(EntidadeFisica entidade) {
        return entidade.aceitar(this);
    }

    @Override
    public String exibirParticula(Particula particula) {
        ParticulaTipo tipo = particula.getTipo();
        return "Particula{" +
                "id=" + particula.getId() +
                ", nome='" + particula.getNome() + '\'' +
                ", tipo='" + tipo.getNomeTipo() + '\'' +
                ", carga='" + tipo.getCarga() + '\'' +
                ", massa=" + tipo.getMassa() +
                '}';
    }

    @Override
    public String exibirForca(Forca forca) {
        return "Forca{" +
                "intensidade=" + forca.getMagnitude() +
                ", direcao='" + forca.getDirecao() + '\'' +
                ", tipo='" + forca.getTipo() + '\'' +
                '}';
    }

    @Override
    public String exibirCampo(Campo campo) {
        return "Campo{" +
                "tipo='" + campo.getTipo() + '\'' +
                ", intensidade=" + campo.getIntensidade() +
                '}';
    }
}
