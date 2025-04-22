package Especiais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class SistemaPessoasTest {

    private SistemaPessoas sistema;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaPessoas();
    }

    @Test
    public void testCadastrarPessoa() {
        Pessoa pessoa = new Pessoa("João", 30, "Deficiência Auditiva", "Moderado", "Rua 1, 123");
        sistema.cadastrarPessoa(pessoa);

        assertEquals(1, sistema.listarPessoas("Deficiência Auditiva", "Moderado").size());
    }

    @Test
    public void testCadastrarAtendimento() {
        Pessoa pessoa = new Pessoa("João", 30, "Deficiência Auditiva", "Moderado", "Rua 1, 123");
        sistema.cadastrarPessoa(pessoa);
        Atendimento atendimento = new Atendimento("Fisioterapia", "Dr. Silva", "2025-04-20");
        sistema.cadastrarAtendimento(atendimento);

        List<String> relatorio = sistema.gerarRelatorioAtendimentos(pessoa);
        assertEquals(1, relatorio.size());
    }

    @Test
    public void testListarPessoas() {
        Pessoa pessoa1 = new Pessoa("João", 30, "Deficiência Auditiva", "Moderado", "Rua 1, 123");
        Pessoa pessoa2 = new Pessoa("Maria", 25, "Deficiência Visual", "Severo", "Rua 2, 456");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);

        List<Pessoa> pessoas = sistema.listarPessoas("Deficiência Auditiva", "Moderado");
        assertEquals(1, pessoas.size());
        assertEquals("João", pessoas.get(0).getNome());
    }
}

