import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroPar = 0;
        int numeroImpar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numeroPar++;
            } else {
                numeroImpar++;
            }
        }

        System.out.println("Quantidade de números pares: " + numeroPar);
        System.out.println("Quantidade de números ímpares: " + numeroImpar);

        scanner.close();

    }
}
