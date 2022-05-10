package br.com.dtarnivelamentotecnico.classes;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

    //encapsulamnto = proteger o acesso ao atributo
    private DestinoEnum destino;
    private List<Acompanhante> acompanhante;
    //private List<String> acomapanhante = new ArrayList<String>();

    //contrutor
    public Viagem(DestinoEnum localDestino) {
        this.destino = localDestino;
    }

    public DestinoEnum getDestino() {
        return destino;
    }

    public void setDestino(DestinoEnum destino) {
        destino = destino;
    }

    public List<Acompanhante> getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(List<Acompanhante> acompanhante) throws Exception {
        this.acompanhante = acompanhante;
    }
}
