package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributos
    private Set<Tarefa> tarefaSet;

    //construtor
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    //metodos
    public void adicionarTarefa(String tarefa, boolean concluido){
        tarefaSet.add(new Tarefa(tarefa, concluido));
    }

    public boolean removerTarefa(String tarefa){
        for (Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(tarefa)) {
                tarefaSet.remove(t);
                System.out.println("Tarefa " + tarefa + " removida.");
                return true;
            }
        }
        System.out.println("Tarefa não " + tarefa + " removida.");
        return false;
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }

    public void obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaSet){
            if(t.isConcluido()){
                tarefasConcluidas.add(t);
            }
        }
        System.out.println("Tarefas concluídas: " + tarefasConcluidas);
    }

    public void obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes= new HashSet<>();
        for (Tarefa t: tarefaSet){
            if(!t.isConcluido()){
                tarefasPendentes.add(t);
            }
        }
        System.out.println("Tarefas pendentes: " + tarefasPendentes);
    }

    public void marcarTarefaConcluida(String tarefa){
        for (Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(tarefa)){
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String tarefa){
        for (Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(tarefa)){
                t.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar", false);
        listaTarefas.adicionarTarefa("Passar", false);
        listaTarefas.adicionarTarefa("Guardar", true);
        listaTarefas.adicionarTarefa("Cozinhar", false);
        listaTarefas.adicionarTarefa("Planejar", false);

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.removerTarefa("Cozinhar");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.obterTarefasConcluidas();
        listaTarefas.marcarTarefaConcluida("Lavar");
        listaTarefas.obterTarefasConcluidas();

        listaTarefas.obterTarefasPendentes();
        listaTarefas.marcarTarefaPendente("Lavar");
        listaTarefas.obterTarefasPendentes();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }




}
