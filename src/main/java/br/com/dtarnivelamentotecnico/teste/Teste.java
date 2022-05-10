package br.com.dtarnivelamentotecnico.teste;

import br.com.dtarnivelamentotecnico.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) throws Exception {
        Viagem venda = new Viagem(DestinoEnum.SAOPAULO);
        System.out.println(venda.getDestino().getDescricao());

        Acompanhante acompanhante = new Acompanhante();
        acompanhante.setNome("Diego");
        acompanhante.setIdade(30);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Isa");
        acompanhante2.setIdade(40);

        Acompanhante acompanhante3 = new Acompanhante();
        acompanhante3.setNome("Rafael");
        acompanhante3.setIdade(10);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante3);
        venda.setAcompanhante(acompanhantes);

//        for (Acompanhante a : venda.getAcompanhante()){
//            a.
//            a.get
//        }

        for (int i = 0; i < venda.getAcompanhante().size(); i++) {
            System.out.println(venda.getAcompanhante().get(i).getNome());
            System.out.println(venda.getAcompanhante().get(i).getIdade());
        }

        System.out.println("--> NACIONAL");
        ViagemNacional viagemNacional = new ViagemNacional(DestinoEnum.SAOPAULO);
        try {
            viagemNacional.setAcompanhante(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um problema");
            System.out.println(excecao.getMessage());
        }
        viagemNacional.setAcompanhante(acompanhantes);
        viagemNacional.setCpf("123456789");
        System.out.println(viagemNacional.toString());
        System.out.println(viagemNacional.getAcompanhante().size());


        List<Acompanhante> acompanhantes2 = new ArrayList<Acompanhante>();
        acompanhantes2.add(acompanhante);
        // acompanhantes2.add(acompanhante3); //descomentando gera = exception


        System.out.println("--> INTERNACIONAL");
        ViagemInternacional viagemInternacional = new ViagemInternacional(DestinoEnum.SAOPAULO);

        try {
            viagemInternacional.setAcompanhante(acompanhantes2); //acompanhantes
        } catch (Exception excecao) {
            System.out.println("Ocorreu um problema");
            System.out.println(excecao.getMessage());
        }

        viagemInternacional.setPassaporte("12497899999");
        System.out.println(viagemInternacional.toString());
        System.out.println(viagemInternacional.getAcompanhante().size());


//        System.out.println(venda.getAcompanhante().get(0).getIdade());
//
//        System.out.println(venda.getAcompanhante().get(1).getNome());
//        System.out.println(venda.getAcompanhante().get(1).getIdade());

//        for (int i = 0; i < venda.size(); i++) {
//        }

    }


}
