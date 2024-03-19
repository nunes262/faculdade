import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome (maior que 3 caracteres): ");
        String nome = scanner.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Erro: O nome deve ter mais de 3 caracteres.");
            System.out.print("Digite o nome novamente: ");
            nome = scanner.nextLine();
        }

        System.out.print("Digite a idade (entre 0 e 150): ");
        int idade = scanner.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Erro: A idade deve estar entre 0 e 150 anos.");
            System.out.print("Digite a idade novamente: ");
            idade = scanner.nextInt();
        }

        System.out.print("Digite o salário (maior que zero): ");
        double salario = scanner.nextDouble();
        while (salario <= 0) {
            System.out.println("Erro: O salário deve ser maior que zero.");
            System.out.print("Digite o salário novamente: ");
            salario = scanner.nextDouble();
        }

        System.out.print("Digite o sexo ('f' ou 'm'): ");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Erro: O sexo deve ser 'f' ou 'm'.");
            System.out.print("Digite o sexo novamente: ");
            sexo = scanner.next().charAt(0);
        }

        System.out.print("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
        char estadoCivil = scanner.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Erro: O estado civil deve ser 's', 'c', 'v' ou 'd'.");
            System.out.print("Digite o estado civil novamente: ");
            estadoCivil = scanner.next().charAt(0);
        }

        System.out.println("\nCadastro realizado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);
        System.out.println("Sexo: " + (sexo == 'f' ? "Feminino" : "Masculino"));
        System.out.println("Estado Civil: " + (estadoCivil == 's' ? "Solteiro(a)"
                : estadoCivil == 'c' ? "Casado(a)" : estadoCivil == 'v' ? "Viúvo(a)" : "Divorciado(a)"));
        scanner.close();
    }
}
