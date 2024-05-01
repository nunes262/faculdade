import java.util.Scanner;

public class escrevendo_metodos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual é a temperatura em Fahrenheit? ");
        double temperaturaFahrenheit = input.nextDouble();
        double temperaturaCelsius = Math.round((5.0 / 9.0) * (temperaturaFahrenheit - 32) * 100.0) / 100.0;

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
        input.close();
    }
}
