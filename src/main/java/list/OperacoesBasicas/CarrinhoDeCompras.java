package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributos
    private List<Item> itemList;

    //construtores
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    //metodos
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i: itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public float calcularValorTotal(){
        float valorTotal = 0;
        for (Item i: itemList){
            valorTotal += i.getQuantidade() * i.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 11.5, 5);
        carrinhoDeCompras.adicionarItem("Carne", 39.8, 3);
        carrinhoDeCompras.adicionarItem("Feijão", 8.47, 2);
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());





    }

}
