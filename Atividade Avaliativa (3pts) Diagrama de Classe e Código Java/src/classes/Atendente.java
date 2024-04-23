package classes;

public class Atendente {

    private String nome;

    public Atendente(String nome) {
        this.nome = nome;
    }

    public Resposta atenderSolicitacao(Solicitação solicitacao) {
        // Processar a solicitação e gerar uma resposta
        return new Resposta("Seu problema foi resolvido.");
    }
}
