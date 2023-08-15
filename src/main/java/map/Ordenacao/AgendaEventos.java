package main.java.map.Ordenacao;

import main.java.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventos = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventos);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> agendaEventos = new TreeMap<>(agendaEventosMap);
        LocalDate dataAtual = LocalDate.now();

        for(Map.Entry<LocalDate, Evento> entry: agendaEventos.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento é: " + entry.getValue() + ". Ele acontecerá na data: " + entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023,8,14), "Evento 01", "Iniciando a agenda");
        agendaEventos.adicionarEvento(LocalDate.of(2023,8,15), "Evento 02", "Dia de hj");
        agendaEventos.adicionarEvento(LocalDate.of(2023,8,16), "Evento 03", "Dia de amanha");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }

}
