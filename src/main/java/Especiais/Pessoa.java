package Especiais;

public class Pessoa implements InterfacePessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grauDeficiencia;
    private String endereco;

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grauDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeficiencia = grauDeficiencia;
        this.endereco = endereco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    @Override
    public String getGrauDeficiencia() {
        return grauDeficiencia;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }
}
