package Futebol;

public class Partida implements InterfacePartida {
    Time time1;
    Time time2;
    private int placarTime1;
    private int placarTime2;

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    @Override
    public void registrarPlacar(int placarTime1, int placarTime2) {
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
    }

    @Override
    public void exibirPlacar() {
        System.out.println(time1.getNome() + " " + placarTime1 + " x " + placarTime2 + " " + time2.getNome());
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }
}

