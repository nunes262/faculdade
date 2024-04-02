import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de 1 a 10:");
        int numero = scanner.nextInt();

        if (numero > 10 || numero < 0) {
            System.out.println("Numero invalido");
            System.out.print("Digite o numero de 1 a 10:");
            numero = scanner.nextInt();
        }

        for (int i = 0; i <= 10; i++) {
            int soma = numero * i;
            System.out.println(numero + "x" + i + " = " + soma);
        }

        scanner.close();
    }
}
