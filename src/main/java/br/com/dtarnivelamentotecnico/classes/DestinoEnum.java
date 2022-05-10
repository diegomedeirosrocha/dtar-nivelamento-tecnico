package br.com.dtarnivelamentotecnico.classes;

public enum DestinoEnum {

    SAOPAULO("São Paulo"),
    RJ("Rio de Janeiro"),
    PARANA("Parana"),
    CURITIBA("Parana");

//    SAOPAULO, RJ, PARANA, CURITIBA;

    private String cidade;

    DestinoEnum (String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return this.cidade;
    }
}
