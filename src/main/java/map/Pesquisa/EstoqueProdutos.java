package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    private void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    private void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    private double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    private Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(maiorPreco < p.getPreco()){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    private Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(menorPreco > p.getPreco()){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    private Produto obterProdutoMaiorValorEmQuantidadeTotalNoEstoque(){
        Produto produtoMaiorValorEmQuantidadeTotalNoEstoque = null;
        double valorEmQuantidadeTotalNoEstoque = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (valorEmQuantidadeTotalNoEstoque < (p.getPreco() * p.getQuantidade())) {
                    valorEmQuantidadeTotalNoEstoque = (p.getPreco() * p.getQuantidade());
                    produtoMaiorValorEmQuantidadeTotalNoEstoque = p;
                }
            }
        }return produtoMaiorValorEmQuantidadeTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1,"Faca", 5, 5.24);
        estoqueProdutos.adicionarProduto(2, "Copo", 8, 2.5);
        estoqueProdutos.adicionarProduto(3, "TV", 2, 1253);
        estoqueProdutos.adicionarProduto(4, "Microondas", 20, 700);
        estoqueProdutos.adicionarProduto(5, "Som", 4, 456);
        estoqueProdutos.adicionarProduto(6, "Notebook", 6, 1245);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println(estoqueProdutos.obterProdutoMaiorValorEmQuantidadeTotalNoEstoque());
    }


}
