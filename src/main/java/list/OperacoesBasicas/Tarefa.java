package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributos
    private String descricao;

    //construtores
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //metodos
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
