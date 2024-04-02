import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        int nota = leitor.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            System.out.print("Digite a nota: ");
            nota = leitor.nextInt();
        }

        System.out.println("nota valida, " + nota);
        leitor.close();
    }
}