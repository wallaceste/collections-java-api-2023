package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> listaNumeros;


    //construtores
    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    //metodos
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int somaListaNumeros = 0;
        for(int n: listaNumeros){
            somaListaNumeros = Integer.sum(somaListaNumeros, n);
        }
        return somaListaNumeros;
    }

    public int encontrarMaiorNumero(){
        return Collections.max(listaNumeros);
    }

    public int encontrarMenorNumero(){
        return Collections.min(listaNumeros);
    }

    public List<Integer> exibirNumeros(){
        return listaNumeros;
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros listaNumerosTeste = new SomaNumeros();

        listaNumerosTeste.adicionarNumero(5);
        listaNumerosTeste.adicionarNumero(23);
        listaNumerosTeste.adicionarNumero(51);
        listaNumerosTeste.adicionarNumero(2);
        listaNumerosTeste.adicionarNumero(85);

        System.out.println(listaNumerosTeste.exibirNumeros());

        System.out.println(listaNumerosTeste.calcularSoma());

        System.out.println(listaNumerosTeste.encontrarMaiorNumero());

        System.out.println(listaNumerosTeste.encontrarMenorNumero());

    }


}
