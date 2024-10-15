import java.util.Scanner;

public class Lista03Exe01 {
    public static void main(String[] args) {
        Scanner entrada = null;

        try {
            entrada = new Scanner(System.in);

            double primeiroNumero = solicitarNumero(entrada, "Digite o primeiro número positivo: ");

            double segundoNumero = solicitarNumero(entrada, "Digite o segundo número positivo: ");

            double resultado = dividirNumeros(primeiroNumero, segundoNumero);

            System.out.println("O resultado da divisão é: " + resultado);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        } finally {
            if (entrada != null) {
                entrada.close();
            }
            System.out.println("Programa finalizado.");
        }
    }

    private static double solicitarNumero(Scanner entrada, String mensagem) {
        System.out.print(mensagem);
        double numero = entrada.nextDouble();
        if (numero <= 0) {
            throw new IllegalArgumentException("Número inválido! Por favor, insira um número positivo maior que zero.");
        }
        return numero;
    }

    private static double dividirNumeros(double num1, double num2) {
        return num1 / num2;
    }
}