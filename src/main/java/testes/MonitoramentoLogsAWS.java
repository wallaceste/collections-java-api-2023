package main.java.testes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        
        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];
            //eventosPorServico.adicionarEventosPorServico(servico, 1);
            if(!eventosPorServico.containsKey(servico)){
                eventosPorServico.put(servico, 1L);
            }else {
                eventosPorServico.put(servico, eventosPorServico.get(servico)+1L);
            }
            //TODO: Utilize o mapa para registrar/incrementar o serviço em questão.
        }


        String maiorQtd = null;
        String menorQtd = null;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (Map.Entry<String, Long> entry: eventosPorServico.entrySet()){
            if (min > entry.getValue()){
                min = entry.getValue();
                menorQtd = entry.getKey();
            }
            if (max < entry.getValue()){
                max = entry.getValue();
                maiorQtd = entry.getKey();
            }
        }

        System.out.println("Eventos por servico:");

        for (Map.Entry<String, Long> entry: eventosPorServico.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("Maior:" + maiorQtd);
        System.out.println("Menor:" + menorQtd);


    }
}