package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavraMap;


    public Dicionario() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!palavraMap.isEmpty()){
            palavraMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if(!palavraMap.isEmpty()){
            System.out.println(palavraMap);
        }
        else {
            System.out.println("Map vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String retornoBusca = null;
        if(!palavraMap.isEmpty()){
            if (palavraMap.get(palavra)!=null) {
                retornoBusca = palavraMap.get(palavra);
            }
            else {
                retornoBusca = "Palavra não localizada.";
            }
        }
        else {
            retornoBusca = "Map vazio.";
        }
        return retornoBusca;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Carro", "veículo de 4 rodas");
        dicionario.adicionarPalavra("Moto", "Veículo de 2 rodas");
        dicionario.adicionarPalavra("Avião", "Veículo que voa");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Moto"));

        dicionario.removerPalavra("Moto");

        System.out.println(dicionario.pesquisarPorPalavra("Moto"));
    }

}
