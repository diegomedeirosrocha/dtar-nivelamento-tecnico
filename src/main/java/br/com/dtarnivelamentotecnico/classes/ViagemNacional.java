package br.com.dtarnivelamentotecnico.classes;

import java.util.List;

public class ViagemNacional extends Viagem {
    private String cpf;

    public ViagemNacional(DestinoEnum localDestino) {
        super(localDestino);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //*** polimorfismo (subscrita do metodo do seu pai)
    @Override
    public void setAcompanhante(List<Acompanhante> acompanhante) throws Exception{
        if (acompanhante.size() <=4){
            super.setAcompanhante(acompanhante);
        } else {
            throw new Exception("viagem nacional nao permite mais que 4 acompanhante");
        }
    }

    @Override
    public String toString() {
        return "ViagemNacional{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
