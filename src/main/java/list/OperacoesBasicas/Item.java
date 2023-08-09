package main.java.list.OperacoesBasicas;

public class Item {
    //atributos
    private String nome;
    private Double preco;
    private Integer quantidade;


    //construtores
    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodos

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return  " Item='" + nome +
                ", Preço=" + preco +
                ", Quantidade=" + quantidade + "  ";
    }
}
