import java.util.Scanner;
import java.nio.file.*;
import java.io.*;

import model.Worker;
import strategy.CalculateTaxas;
import utils.CEPService;
import utils.CPFValidator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------- INICIO ATIVIDADE ---------------");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome -> ");
        String name = input.nextLine();

        System.out.print("Digite seu salario bruto -> ");
        Double salary = input.nextDouble();

        System.out.print("Digite quantos dependentes tem -> ");
        int dependents = input.nextInt();

        input.nextLine();

        System.out.print("Digite seu CPF -> ");
        String cpf = input.nextLine();

        System.out.print("Digite seu CEP -> ");
        String cep = input.nextLine();

        Worker worker = new Worker(name, salary, dependents);
        CPFValidator cpfValidator = new CPFValidator();
        CEPService cepService = new CEPService();
        CalculateTaxas taxCalculator = new CalculateTaxas();

        String fileName = "file_" + name + ".txt";

        OutputStream os = new FileOutputStream(fileName);
        Writer writer = new OutputStreamWriter(os);
        BufferedWriter br = new BufferedWriter(writer);

        String resultado = String.join("\n",
                "----------- RESULTADO ---------------",
                "",
                worker.toString(),
                taxCalculator.taxas(salary, dependents),
                "CPF: " + cpfValidator.isValid(cpf),
                "----------- CEP ---------------",
                "",
                cepService.getEnderecoFromCEP(cep));

        br.write(resultado);
        br.close();

        System.out.println("\nProcure pelo arquivo " + fileName + " na arvore do projeto");
        System.out.println("----------- FIM ATIVIDADE ---------------");

        input.close();
    }
}
