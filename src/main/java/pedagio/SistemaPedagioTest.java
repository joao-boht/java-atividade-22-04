package pedagio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaPedagioTest {

    private SistemaPedagio sistema;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaPedagio();
    }

    @Test
    public void testCalcularValorPedagio() {
        Veiculo veiculo = new Veiculo("ABC1234", "carro", 0);
        PracaPedagio praca = new PracaPedagio("Praça A", 10.0);

        double valor = sistema.calcularValorPedagio(veiculo, praca);
        assertEquals(10.0, valor);
    }

    @Test
    public void testGerarRelatorio() {
        // Cadastrando veículos e praças
        Veiculo veiculo = new Veiculo("ABC1234", "carro", 0);
        PracaPedagio praca = new PracaPedagio("Praça A", 10.0);
        sistema.registrarPassagem(veiculo, praca);

        // Gerar relatório
        sistema.gerarRelatorio();
    }

    @Test
    public void testGerarRelatorioArrecadacaoPorPraca() {
        // Cadastrando veículos, praças e passagens
        Veiculo veiculo1 = new Veiculo("ABC1234", "carro", 0);
        Veiculo veiculo2 = new Veiculo("XYZ5678", "moto", 0);
        PracaPedagio praca = new PracaPedagio("Praça A", 10.0);

        sistema.registrarPassagem(veiculo1, praca);
        sistema.registrarPassagem(veiculo2, praca);

        // Gerar relatório de arrecadação por praça
        sistema.gerarRelatorioArrecadacaoPorPraca();
    }
}
