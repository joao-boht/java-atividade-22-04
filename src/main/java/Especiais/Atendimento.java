package Especiais;

public class Atendimento implements InterfaceAtendimento {
    private String tipoAtendimento;
    private String profissionalResponsavel;
    private String dataAtendimento;

    public Atendimento(String tipoAtendimento, String profissionalResponsavel, String dataAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
        this.profissionalResponsavel = profissionalResponsavel;
        this.dataAtendimento = dataAtendimento;
    }

    @Override
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    @Override
    public String getProfissionalResponsavel() {
        return profissionalResponsavel;
    }

    @Override
    public String getDataAtendimento() {
        return dataAtendimento;
    }
}
