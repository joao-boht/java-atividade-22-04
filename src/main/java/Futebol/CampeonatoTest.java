package Futebol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CampeonatoTest {

    private Campeonato campeonato;

    @BeforeEach
    public void setUp() {
        campeonato = new Campeonato();
    }

    @Test
    public void testRegistrarPartida() {
        Time time1 = new Time("Vasco", "Rio de Janeiro");
        Time time2 = new Time("Flamengo", "Rio de Janeiro");

        Partida partida = new Partida(time1, time2);
        partida.registrarPlacar(3, 1); // Vasco venceu Flamengo
        campeonato.registrarPartida(partida);

        // Testar se a pontuação foi calculada corretamente
        assertEquals(3, campeonato.getPontuacao().get(time1));
        assertEquals(0, campeonato.getPontuacao().get(time2));
    }
}
