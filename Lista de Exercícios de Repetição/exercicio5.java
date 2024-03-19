import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        System.out.println("Digite a populacao A: ");
        int populacaoA = scanner.nextInt();
        System.out.println("Digite a taxa de crescimento da populacao A: ");
        double TaxaCrescimentA = scanner.nextDouble();

        System.out.println("Digite a populacao B: ");
        int populacaoB = scanner.nextInt();
        System.out.println("Digite a taxa de crescimento da populacao B: ");
        double TaxaCrescimentB = scanner.nextDouble();

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * TaxaCrescimentA / 100);
            populacaoB += (int) (populacaoB * TaxaCrescimentB / 100);
            i++;
        }

        System.out.println("\nA populacao A se igualar a populacao B demorou " + i + " anos");
        scanner.close();
    }
}