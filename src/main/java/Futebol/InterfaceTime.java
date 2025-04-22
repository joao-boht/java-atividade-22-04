package Futebol;

import java.util.List;

public interface InterfaceTime {
    String getNome();
    String getCidade();
    void adicionarJogadora(Jogadora jogadora);
    List<Jogadora> getJogadoras();  // Corrigido para List<Jogadora>
}

