import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.ArquivoHelper;
import classes.Doacao;
import classes.SistemaDeGerenciamentoDeDoacoes;

public class Main {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        SistemaDeGerenciamentoDeDoacoes sistema = new SistemaDeGerenciamentoDeDoacoes();
        sistema.getDoacoes().addAll(ArquivoHelper.carregarDoacoes());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Adicionar doação");
            System.out.println("2. Ver total de doações em dinheiro");
            System.out.println("3. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Tipo de doação (dinheiro, alimentos, roupas, etc.): ");
                    String tipo = scanner.nextLine();
                    Object quantidade;
                    if (tipo.equalsIgnoreCase("dinheiro")) {
                        System.out.print("Quantidade: ");
                        quantidade = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
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
                        ArquivoHelper.salvarDoacoes(sistema.getDoacoes());
                        System.out.println("Doação adicionada com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar doação. Verifique os dados e tente novamente.");
                    }
                    break;
                case 2:
                    double total = sistema.calcularTotalDeDoacoes();
                    System.out.println("Total de doações em dinheiro: " + total);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            scanner.close();
        }
    }
}
