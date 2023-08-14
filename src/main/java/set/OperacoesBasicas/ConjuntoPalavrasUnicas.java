package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavras;


    //construtor
    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    //metodos
    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p: palavras){
            if (p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        palavras.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        for(String p: palavras){
            if (p.equalsIgnoreCase(palavra)){
                return true;
            }
        }return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas listaPalavras = new ConjuntoPalavrasUnicas();

        listaPalavras.adicionarPalavra("lixo");
        listaPalavras.adicionarPalavra("lixo");
        listaPalavras.adicionarPalavra("carne");
        listaPalavras.adicionarPalavra("ovo");
        listaPalavras.adicionarPalavra("trem");

        listaPalavras.exibirPalavrasUnicas();

        listaPalavras.removerPalavra("lixo");

        listaPalavras.exibirPalavrasUnicas();

        System.out.println(listaPalavras.verificarPalavra("massa"));

        System.out.println(listaPalavras.verificarPalavra("ovo"));
    }

}
