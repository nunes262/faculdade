import java.util.Scanner;

import model.Worker;
import strategy.CalculateTaxas;
import utils.CEPService;
import utils.CPFValidator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------- INICIO ATIVIDADE ---------------\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu CPF -> ");
        String cpf = input.nextLine();

        System.out.print("Digite seu nome -> ");
        String name = input.nextLine();

        System.out.print("Digite seu salario bruto -> ");
        Double salary = input.nextDouble();

        System.out.print("Digite quantos dependentes tem -> ");
        int dependents = input.nextInt();

        System.out.print("Digite seu CEP -> ");
        String cep = input.nextLine();

        Worker worker = new Worker(name, salary, dependents);
        CPFValidator cpfValidator = new CPFValidator();
        CEPService cepService = new CEPService();
        CalculateTaxas taxCalculator = new CalculateTaxas();

        System.out.println(cpfValidator.isValid(cpf));
        System.out.println(worker.toString());
        taxCalculator.taxas(salary, dependents);
        System.out.println(cepService.getEnderecoFromCEP(cep));

        System.out.println("\n----------- FIM ATIVIDADE ---------------");

        input.close();
    }
}
