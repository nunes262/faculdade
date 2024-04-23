import classes.Atendente;
import classes.Cliente;
import classes.Resposta;
import classes.Solicitação;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("João Silva");
        Atendente atendente = new Atendente("Maria Oliveira");

        Solicitação solicitacao = new Solicitação(cliente, "Problema com produto");
        Resposta resposta = atendente.atenderSolicitacao(solicitacao);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Solicitação: " + solicitacao.getDescricao());
        System.out.println("Resposta: " + resposta.getTexto());
    }
}
