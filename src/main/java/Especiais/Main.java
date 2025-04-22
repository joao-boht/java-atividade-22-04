package Especiais;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaPessoas sistema = new SistemaPessoas();

        // Cadastrar pessoas
        Pessoa pessoa1 = new Pessoa("João", 30, "Deficiência Auditiva", "Moderado", "Rua 1, 123");
        Pessoa pessoa2 = new Pessoa("Maria", 25, "Deficiência Visual", "Severo", "Rua 2, 456");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);

        // Cadastrar atendimentos
        Atendimento atendimento1 = new Atendimento("Fisioterapia", "Dr. Silva", "2025-04-20");
        Atendimento atendimento2 = new Atendimento("Terapia Ocupacional", "Dra. Souza", "2025-04-21");

        sistema.cadastrarAtendimento(atendimento1);
        sistema.cadastrarAtendimento(atendimento2);

        // Listar pessoas filtrando por tipo de deficiência e grau
        List<Pessoa> pessoasDeficienciaAuditivaModerada = sistema.listarPessoas("Deficiência Auditiva", "Moderado");
        System.out.println("Pessoas com deficiência auditiva moderada:");
        for (Pessoa p : pessoasDeficienciaAuditivaModerada) {
            System.out.println(p.getNome());
        }

        // Gerar relatório de atendimentos para uma pessoa
        System.out.println("Relatório de atendimentos para " + pessoa1.getNome() + ":");
        List<String> relatorio = sistema.gerarRelatorioAtendimentos(pessoa1);
        for (String linha : relatorio) {
            System.out.println(linha);
        }
    }
}
