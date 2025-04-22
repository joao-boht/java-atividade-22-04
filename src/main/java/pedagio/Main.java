package pedagio;

public class Main {
    public static void main(String[] args) {
        SistemaPedagio sistema = new SistemaPedagio();

        // Criando praças de pedágio
        PracaPedagio praca1 = new PracaPedagio("Praça A", 10.0);
        PracaPedagio praca2 = new PracaPedagio("Praça B", 12.0);

        sistema.registrarPraca(praca1);
        sistema.registrarPraca(praca2);

        // Criando veículos
        Veiculo veiculo1 = new Veiculo("ABC1234", "carro", 0);
        Veiculo veiculo2 = new Veiculo("XYZ5678", "moto", 0);
        Veiculo veiculo3 = new Veiculo("JKL9876", "caminhão", 3);

        // Registrando passagens de veículos
        sistema.registrarPassagem(veiculo1, praca1);
        sistema.registrarPassagem(veiculo2, praca2);
        sistema.registrarPassagem(veiculo3, praca2);

        // Gerar relatórios
        System.out.println("Relatório de Passagens:");
        sistema.gerarRelatorio();

        System.out.println("\nRelatório de Arrecadação por Praça:");
        sistema.gerarRelatorioArrecadacaoPorPraca();
    }
}
