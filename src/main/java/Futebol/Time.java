package Futebol;

import java.util.ArrayList;
import java.util.List;

public class Time implements InterfaceTime {
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoras = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public void adicionarJogadora(Jogadora jogadora) {
        jogadoras.add(jogadora);
    }

    @Override
    public List<Jogadora> getJogadoras() {
        return jogadoras;
    }
}
