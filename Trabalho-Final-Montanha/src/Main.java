import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.ArquivoTexto;
import classes.Doacao;
import classes.GerenciamentoDoacoes;

public class Main {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        GerenciamentoDoacoes sistema = new GerenciamentoDoacoes();
        sistema.getDoacoes().addAll(ArquivoTexto.carregarDoacoes());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Adicionar doação");
            System.out.println("2. Ver total de doações");
            System.out.println("3. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("\nTipo de doação (dinheiro, alimentos, roupas, etc.): ");
                    String tipo = scanner.nextLine();
                    Object quantidade;
                    if (tipo.equalsIgnoreCase("dinheiro")) {
                        System.out.print("Quantidade: ");
                        quantidade = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        System.out.print("Quantidade (descrição): ");
                        quantidade = scanner.nextLine();
                    }
                    System.out.print("Data (dd/MM/yyyy): ");
                    String dataStr = scanner.nextLine();

                    try {
                        Date data = DATE_FORMAT.parse(dataStr);
                        Doacao doacao = new Doacao(tipo, quantidade, data);
                        sistema.adicionarDoacao(doacao);
                        ArquivoTexto.salvarDoacoes(sistema.getDoacoes());
                        System.out.println("\nDoação adicionada com sucesso!");
                    } catch (Exception e) {
                        System.out.println("\nErro ao adicionar doação. Verifique os dados e tente novamente.");
                    }
                    break;
                case 2:
                    int total = sistema.calcularTotalDeDoacoes();
                    System.out.println("\nTotal de doações realizadas: " + total);
                    break;
                case 3:
                    System.out.println("\nObrigado pela doação!");
                    return;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}
