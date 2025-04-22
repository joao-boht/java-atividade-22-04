package Futebol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Campeonato implements InterfaceCampeonato {
    private List<InterfacePartida> partidas;
    private Map<InterfaceTime, Integer> pontuacao;

    public Campeonato() {
        partidas = new ArrayList<>();
        pontuacao = new HashMap<>();
    }

    @Override
    public void registrarPartida(InterfacePartida partida) {
        partidas.add(partida);
        calcularPontuacao();
    }

    @Override
    public void exibirTabela() {
        for (Map.Entry<InterfaceTime, Integer> entry : pontuacao.entrySet()) {
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue() + " pontos");
        }
    }

    @Override
    public void calcularPontuacao() {
        for (InterfacePartida partida : partidas) {
            int placarTime1 = ((Partida) partida).getPlacarTime1();
            int placarTime2 = ((Partida) partida).getPlacarTime2();

            Time time1 = (Time) ((Partida) partida).time1;
            Time time2 = (Time) ((Partida) partida).time2;

            if (placarTime1 > placarTime2) {
                pontuacao.put(time1, pontuacao.getOrDefault(time1, 0) + 3);
            } else if (placarTime1 < placarTime2) {
                pontuacao.put(time2, pontuacao.getOrDefault(time2, 0) + 3);
            } else {
                pontuacao.put(time1, pontuacao.getOrDefault(time1, 0) + 1);
                pontuacao.put(time2, pontuacao.getOrDefault(time2, 0) + 1);
            }
        }
    }

    // Método para acessar a pontuação de cada time
    public Map<InterfaceTime, Integer> getPontuacao() {
        return pontuacao;
    }
}

