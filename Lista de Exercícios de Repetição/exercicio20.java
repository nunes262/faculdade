import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char continuar;
        do {
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero < 16) {
                long fatorial = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            } else {
                System.out.println("Número inválido! Por favor, insira um número inteiro positivo menor que 16.");
            }

            System.out.print("Deseja calcular outro fatorial? (S/N) ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
