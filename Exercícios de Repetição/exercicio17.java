import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero1 = scanner.nextInt();
        int fatorial = 1;
        int resultado = 1;

        while (fatorial <= numero1) {
            resultado *= fatorial;
            fatorial += 1;
        }

        System.out.println(resultado);
        scanner.close();

    }
}
