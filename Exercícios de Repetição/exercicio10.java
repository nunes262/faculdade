import java.util.Scanner;

public class exercicio10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        System.out.println("Números inteiros no intervalo [" + menor + ", " + maior + "]:");
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
