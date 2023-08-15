package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(palavrasMap);
    }

    public void encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        if(!palavrasMap.isEmpty()){
            for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()){
                if(maiorContagem < entry.getValue()){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        System.out.println(palavraMaisFrequente + " " + maiorContagem);
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Calamria", 5);
        contagemPalavras.adicionarPalavra("Lentidao", 12);
        contagemPalavras.adicionarPalavra("Verdade", 2);

        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.encontrarPalavraMaisFrequente();
        contagemPalavras.removerPalavra("Verdade");
        contagemPalavras.exibirContagemPalavras();
    }
}
