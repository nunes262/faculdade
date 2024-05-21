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

        String fileName = "file1.txt";
        boolean sameCpf = false;

        if (Files.exists(Paths.get(fileName))) {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("CPF: " + cpf)) {
                    sameCpf = true;
                    break;
                }
            }
            reader.close();
        }

        if (!sameCpf) {
            fileName = "file_" + name + ".txt";
        }

        OutputStream os = new FileOutputStream(fileName);
        Writer writer = new OutputStreamWriter(os);
        BufferedWriter br = new BufferedWriter(writer);

        br.write("----------- RESULTADO ---------------");
        br.newLine();
        br.newLine();
        br.write(worker.toString());
        br.write(taxCalculator.taxas(salary, dependents));
        br.newLine();
        br.write("CPF: " + cpfValidator.isValid(cpf));
        br.newLine();
        br.write("----------- CEP ---------------");
        br.newLine();
        br.newLine();
        br.write(cepService.getEnderecoFromCEP(cep));
        br.close();

        System.out.println("\nProcure pelo arquivo " + fileName + " na arvore do projeto");
        System.out.println("----------- FIM ATIVIDADE ---------------");

        input.close();
    }
}
