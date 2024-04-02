import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);

        System.out.println("Números no intervalo:");
        int soma = 0;
        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.print(i + "");
            soma += i;
        }

        System.out.println("Soma dos números no intervalo: " + soma);

        scanner.close();
    }
}
