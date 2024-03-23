import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Insira os números (entre 0 e 1000):");
        for (int i = 0; i < n; i++) {
            int num;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                num = scanner.nextInt();
                if (num < 0 || num > 1000) {
                    System.out.println("Número fora do intervalo permitido (0 a 1000). Tente novamente.");
                }
            } while (num < 0 || num > 1000);
            numbers[i] = num;
        }

        scanner.close();

        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        System.out.println("Menor valor: " + min);
        System.out.println("Maior valor: " + max);
        System.out.println("Soma dos valores: " + sum);
    }
}
