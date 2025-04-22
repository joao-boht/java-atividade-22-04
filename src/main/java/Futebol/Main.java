package Futebol;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time("Vasco", "Rio de Janeiro");
        Time time2 = new Time("Flamengo", "Rio de Janeiro");

        Jogadora jogadora1 = new Jogadora("Ana", 23, "Atacante", 9);
        Jogadora jogadora2 = new Jogadora("Maria", 25, "Meio-Campo", 10);

        time1.adicionarJogadora(jogadora1);
        time2.adicionarJogadora(jogadora2);

        Campeonato campeonato = new Campeonato();

        Partida partida1 = new Partida(time1, time2);
        partida1.registrarPlacar(3, 1);  // Vasco venceu Flamengo
        campeonato.registrarPartida(partida1);

        campeonato.exibirTabela();
    }
}
