package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    //construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //metodos
    private void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    private Set<Contato> exibirContatos(){
        return contatoSet;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> listaContatosEcontrados = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                listaContatosEcontrados.add(c);
            }
        }
        return listaContatosEcontrados;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wallace", 2121);
        agendaContatos.adicionarContato("Wallace Stevan", 2222);
        agendaContatos.adicionarContato("Carlos", 2323);
        agendaContatos.adicionarContato("Wallace ALberto", 2424);
        agendaContatos.adicionarContato("Leonardo", 2525);

        System.out.println(agendaContatos.exibirContatos());

        System.out.println(agendaContatos.pesquisarPorNome("Wallace"));

        agendaContatos.atualizarNumeroContato("Wallace Stevan", 1234);

        System.out.println(agendaContatos.exibirContatos());



    }

}
