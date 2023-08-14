package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvite;

    //construtor
    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigoConvite = codigo;
    }

    //metodos
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    //metodos pra comparar elementos pelo codigo do convite e nao duplicar por equal e hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }
}
