import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Você assistiu o Snyder Cut? (s/n): ");
        String resposta = input.nextLine();

        if (resposta.equals("s")) {
            System.out.println("Qual sua nota para o filme? (de 1 a 10) ");
            int nota = input.nextInt();

            if (nota > 10 || nota < 1) {
                System.out.println("Nota inválida, insira novamente uma nota entre 1 e 10");
                nota = input.nextInt();
            }

            for (int i = 0; i < nota; i++) {
                System.out.println("For Darkseid!");
            }
        } else if (resposta.equals("n")) {
            System.out.println("Thanos is Inevitable");
        } else {
            System.out.println("Resposta inválida");
        }

        input.close();
    }
}