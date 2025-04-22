package pedagio;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedagio {
    private List<PracaPedagio> pracas;
    private List<RegistroPassagem> passagens;

    public SistemaPedagio() {
        pracas = new ArrayList<>();
        passagens = new ArrayList<>();
    }

    // Registrar uma praça de pedágio
    public void registrarPraca(PracaPedagio praca) {
        pracas.add(praca);
    }

    // Registrar passagem de veículo
    public void registrarPassagem(Veiculo veiculo, PracaPedagio praca) {
        double valorPedagio = calcularValorPedagio(veiculo, praca);
        passagens.add(new RegistroPassagem(veiculo, praca, valorPedagio));
    }

    // Calcular o valor do pedágio
    public double calcularValorPedagio(Veiculo veiculo, PracaPedagio praca) {
        double tarifaBase = praca.getTarifaBase();
        switch (veiculo.getTipo().toLowerCase()) {
            case "carro":
                return tarifaBase;
            case "moto":
                return tarifaBase * 0.5;
            case "caminhão":
                return tarifaBase * veiculo.getEixos();
            default:
                return 0;
        }
    }

    // Gerar relatório de passagens
    public void gerarRelatorio() {
        for (RegistroPassagem passagem : passagens) {
            System.out.println("Veículo: " + passagem.getVeiculo().getPlaca() +
                    " | Localização: " + passagem.getPraca().getLocalizacao() +
                    " | Valor: R$ " + passagem.getValor());
        }
    }

    // Gerar relatório de arrecadação por praça
    public void gerarRelatorioArrecadacaoPorPraca() {
        for (PracaPedagio praca : pracas) {
            double totalArrecadado = 0;
            for (RegistroPassagem passagem : passagens) {
                if (passagem.getPraca().equals(praca)) {
                    totalArrecadado += passagem.getValor();
                }
            }
            System.out.println("Praça de Pedágio: " + praca.getLocalizacao() +
                    " | Total Arrecadado: R$ " + totalArrecadado);
        }
    }
}
