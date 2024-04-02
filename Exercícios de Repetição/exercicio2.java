import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        while (senha.equals(nomeUsuario)) {
            System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
            System.out.print("Digite a senha novamente: ");
            senha = scanner.nextLine();
        }

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();

    }
}
