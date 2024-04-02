import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a série de Fibonacci:");
        int n = scanner.nextInt();

        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(proximoTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    }
}
