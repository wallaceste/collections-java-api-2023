package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> pessoaList;

    //contrutor

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    //metodos
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Wallace", 32, 1.72);
        ordenacaoPessoas.adicionarPessoa("Ciclano", 50, 1.8);
        ordenacaoPessoas.adicionarPessoa("BolsoLula", 79, 1.25);
        ordenacaoPessoas.adicionarPessoa("Kakaroto", 27, 1.92);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }


}
