package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer>  agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Wall", 212121);
        agendaContatos.adicionarContato("Call", 222222);
        agendaContatos.adicionarContato("Zall", 232323);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Call");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Zall"));

        System.out.println(agendaContatos.pesquisarPorNome("Call"));
    }
}
