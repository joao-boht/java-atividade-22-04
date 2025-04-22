package pedagio;

public class RegistroPassagem {
    private Veiculo veiculo;
    private PracaPedagio praca;
    private double valor;

    public RegistroPassagem(Veiculo veiculo, PracaPedagio praca, double valor) {
        this.veiculo = veiculo;
        this.praca = praca;
        this.valor = valor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public PracaPedagio getPraca() {
        return praca;
    }

    public double getValor() {
        return valor;
    }
}
