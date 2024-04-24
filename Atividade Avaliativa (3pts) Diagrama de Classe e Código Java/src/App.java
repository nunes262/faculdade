import classes.Atendente;
import classes.Cliente;
import classes.Pagamento;
import classes.Resposta;
import classes.Solicitação;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = input.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        System.out.println("Digite o nome do atendente:");
        String nomeAtendente = input.nextLine();
        Atendente atendente = new Atendente(nomeAtendente);

        System.out.println("Descreva a solicitação:");
        String descricaoSolicitacao = input.nextLine();
        Solicitação solicitacao = new Solicitação(cliente, descricaoSolicitacao);

        Resposta resposta = atendente.atenderSolicitação(solicitacao);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Solicitação: " + solicitacao.getDescricao());
        System.out.println("Resposta: " + resposta.getTexto());

        System.out.println("O atendimento foi resolvido? (sim/não)");
        String respostaAtendimento = input.nextLine();

        if (respostaAtendimento.equalsIgnoreCase("sim")) {
            System.out.println("Atendimento concluído com sucesso!");
            System.out.println("Iniciando pagamento...");
            System.out.println("Digite o valor total:");
            double valorTotal = input.nextDouble();
            Pagamento pagamento = new Pagamento(valorTotal);
            pagamento.processarPagamento();
        } else {
            System.out.println("Por favor, entre em contato novamente se precisar de mais assistência.");
        }

        input.close();
    }
}
