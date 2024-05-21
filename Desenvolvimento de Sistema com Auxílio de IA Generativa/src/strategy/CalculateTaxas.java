package strategy;

import java.text.DecimalFormat;

public class CalculateTaxas {

    public interface TaxStrategy {
        double calculateTax(double salary);
    }

    public class INSSTaxStrategy implements TaxStrategy {
        @Override
        public double calculateTax(double salary) {
            if (salary <= 1556.91) {
                return salary * 0.08;
            } else if (salary <= 2598.82) {
                return 124.55 + (salary - 1556.91) * 0.09;
            } else if (salary <= 5607.22) {
                return 238.64 + (salary - 2598.82) * 0.11;
            } else if (salary <= 6000.00) {
                return 627.13 + (salary - 5607.22) * 0.12;
            } else {
                return 728.16;
            }
        }
    }

    public class IRRFtaxStrategy implements TaxStrategy {
        @Override
        public double calculateTax(double baseIRRF) {
            if (baseIRRF <= 2000.00) {
                return 0;
            } else if (baseIRRF <= 2500.00) {
                return (baseIRRF - 2000.00) * 0.075;
            } else if (baseIRRF <= 3000.00) {
                return 150.00 + (baseIRRF - 2500.00) * 0.15;
            } else if (baseIRRF <= 3500.00) {
                return 450.00 + (baseIRRF - 3000.00) * 0.225;
            } else if (baseIRRF <= 4000.00) {
                return 775.00 + (baseIRRF - 3500.00) * 0.275;
            } else {
                return 1350.00 + (baseIRRF - 4000.00) * 0.30;
            }
        }
    }

    public String taxas(double salary, int dependents) {
        TaxStrategy inssStrategy = new INSSTaxStrategy();
        TaxStrategy irrfStrategy = new IRRFtaxStrategy();

        double descontoINSS = inssStrategy.calculateTax(salary);
        double baseIRRF = salary - descontoINSS;
        double descontoIRRF = irrfStrategy.calculateTax(baseIRRF);

        double result = (salary - descontoINSS - descontoIRRF);

        DecimalFormat df = new DecimalFormat("#.00");

        return ("\nDesconto INSS: R$" + df.format(descontoINSS) + "\nDesconto IRRF: R$" + df.format(descontoIRRF)
                + "\nSalario liquido: R$" + df.format(result));
    }
}
