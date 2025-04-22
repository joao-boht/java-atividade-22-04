package Especiais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaPessoas {
    private List<Pessoa> pessoas;
    private List<Atendimento> atendimentos;

    public SistemaPessoas() {
        pessoas = new ArrayList<>();
        atendimentos = new ArrayList<>();
    }

    // Cadastrar pessoa
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    // Cadastrar atendimento
    public void cadastrarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    // Listar pessoas com filtro
    public List<Pessoa> listarPessoas(String tipoDeficiencia, String grauDeficiencia) {
        return pessoas.stream()
                .filter(p -> p.getTipoDeficiencia().equalsIgnoreCase(tipoDeficiencia) &&
                        p.getGrauDeficiencia().equalsIgnoreCase(grauDeficiencia))
                .collect(Collectors.toList());
    }

    // Gerar relatório de atendimentos por pessoa
    public List<String> gerarRelatorioAtendimentos(Pessoa pessoa) {
        List<String> relatorio = new ArrayList<>();
        for (Atendimento atendimento : atendimentos) {
            relatorio.add("Atendimento: " + atendimento.getTipoAtendimento() +
                    " | Profissional: " + atendimento.getProfissionalResponsavel() +
                    " | Data: " + atendimento.getDataAtendimento());
        }
        return relatorio;
    }
}
