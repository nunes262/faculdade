package classes;

public class Atendente {
    private String nome;

    public Atendente(String nome) {
        this.nome = nome;
    }

    public Resposta atenderSolicitação(Solicitação solicitacao) {
        return new Resposta("Apos seu atendimento.");
    }
}
