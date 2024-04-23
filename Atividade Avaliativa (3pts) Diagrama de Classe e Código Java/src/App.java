import classes.Atendente;
import classes.Cliente;
import classes.Resposta;
import classes.Solicitação;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        System.out.println("Digite o nome do atendente:");
        String nomeAtendente = scanner.nextLine();
        Atendente atendente = new Atendente(nomeAtendente);

        System.out.println("Descreva a solicitação:");
        String descricaoSolicitacao = scanner.nextLine();
        Solicitação solicitacao = new Solicitação(cliente, descricaoSolicitacao);

        Resposta resposta = atendente.atenderSolicitação(solicitacao);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Solicitação: " + solicitacao.getDescricao());
        System.out.println("Resposta: " + resposta.getTexto());

        System.out.println("O atendimento foi resolvido? (sim/não)");
        String respostaAtendimento = scanner.nextLine();

        if (respostaAtendimento.equalsIgnoreCase("sim")) {
            System.out.println("Atendimento concluído com sucesso!");
        } else {
            System.out.println("Por favor, entre em contato novamente se precisar de mais assistência.");
        }

        scanner.close();
    }
}
