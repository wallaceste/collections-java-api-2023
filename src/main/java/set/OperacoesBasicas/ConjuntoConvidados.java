package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    //contrutor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //metodos
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Wall", 77);
        convidados.adicionarConvidado("Carleta", 81);
        convidados.adicionarConvidado("Josualdo", 22);

        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(81);

        convidados.exibirConvidados();
        System.out.println(convidados.contarConvidados());

    }


}
