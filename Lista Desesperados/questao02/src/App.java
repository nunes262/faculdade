import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Quantos procedimentos? ");
        int Numprocedimentos = scanner.nextInt();

        String procedimentos[] = new String[Numprocedimentos];
        String datasDisponiveis[] = new String[Numprocedimentos];

        for (int i = 0; i < Numprocedimentos; i++) {
            System.out.print("Nome do procedimento " + (i + 1) + ": ");
            procedimentos[i] = scanner.nextLine();

            System.out.print("Data disponível para o procedimento " + (i + 1) + ": ");
            datasDisponiveis[i] = scanner.nextLine();
        }

        System.out.println("\nInformações do agendamento:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Procedimentos agendados: " + Numprocedimentos);

        scanner.close();
    }
}
