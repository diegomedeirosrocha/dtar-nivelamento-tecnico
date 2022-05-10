package br.com.dtarnivelamentotecnico.classes;

import java.util.List;

public class ViagemInternacional extends Viagem {

    private String passaporte;

    public ViagemInternacional(DestinoEnum localDestino){
        super(localDestino);
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    //*** polimorfismo (subscrita do metodo do seu pai)
    @Override
    public void setAcompanhante(List<Acompanhante> acompanhante) throws Exception{
        if (acompanhante.size() <=1){
            super.setAcompanhante(acompanhante);
        } else {
            throw new Exception("viagem internacional nao permite mais que 1 acompanhante");
        }
    }

    @Override
    public String toString() {
        return "ViagemInternacional{" +
                "passaporte='" + passaporte + '\'' +
                '}';
    }
}
