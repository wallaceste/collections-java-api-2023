package main.java.list.Pesquisa;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> catalogoLivros ;


    //construtores
    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }


    //metodos
   public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
   }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro l : catalogoLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(l);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if (!catalogoLivros.isEmpty()) {
            for (Livro l : catalogoLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosEncontrados.add(l);
                }
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if (!catalogoLivros.isEmpty()) {
            for (Livro l : catalogoLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = l;
                    break;
                }
            }
        }
        return livroEncontrado;
    }


    //teste
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Senhor das Moscas", "Charlie", 1999);
        catalogoLivros.adicionarLivro("Debi e Loid", "Jean", 1890);
        catalogoLivros.adicionarLivro("Biblia", "Deus", 1);
        catalogoLivros.adicionarLivro("Debi e Loid", "Carlouis", 2022);

        System.out.println(catalogoLivros.pesquisarPorAutor("Deus"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1800,2021));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1,1890));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Debi e Loid"));




    }



}
