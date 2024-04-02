import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Bem-vindo, " + nome + ", ao Burguer King, o pedido está completo? (s/n)");
        String resp = scanner.nextLine();

        if (resp.equals("n")) {
            System.out.print("Qual o pedido?");
            String pedido = scanner.nextLine();
            System.out.print("Qual a quantidade?");
            int quantidade = scanner.nextInt();

            System.out.println("Seu pedido foi: " + pedido + ", com quantidade de: " + quantidade);
        } else {
            System.out.print("Pedido encaminhado para a cozinha");
        }
        scanner.close();
    }
}
