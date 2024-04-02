import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o numero base: ");
        double base = scanner.nextDouble();

        System.out.print("Coloque o expoente: ");
        double expoente = scanner.nextDouble();

        double resultado = Math.pow(base, expoente);
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}
