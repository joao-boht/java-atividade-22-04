package Futebol;

public class Jogadora implements InterfaceJogadora {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    public Jogadora(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
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
    public String getPosicao() {
        return posicao;
    }

    @Override
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
}
