package classes;

import java.util.Scanner;

public class Pagamento {
    private double valorTotal;
    private double valorPago;
    private TipoPagamento tipoPagamento;

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void processarPagamento() {
        System.out.println("Iniciando processamento de pagamento...");

        // Perguntar quantas parcelas e passar o cartão
        System.out.println("Deseja parcelar o pagamento? (S/N)");
        String respostaParcelamento = new Scanner(System.in).nextLine();

        if (respostaParcelamento.equalsIgnoreCase("S")) {
            System.out.println("Quantas parcelas deseja? (Digite um número inteiro)");
            int numeroParcelas = new Scanner(System.in).nextInt();

            calcularValorParcelas(numeroParcelas);
        } else {
            System.out.println("Pagamento à vista selecionado.");
            valorPago = valorTotal;
        }

        // Informar o tipo de pagamento e passar o cartão
        System.out.println("Selecione o tipo de pagamento:");
        System.out.println("1 - Cartão de crédito");
        System.out.println("2 - Cartão de débito");
        System.out.println("3 - Dinheiro");

        int opcaoTipoPagamento = new Scanner(System.in).nextInt();

        switch (opcaoTipoPagamento) {
            case 1:
                tipoPagamento = TipoPagamento.CARTAO_CREDITO;
                break;
            case 2:
                tipoPagamento = TipoPagamento.CARTAO_DEBITO;
                break;
            case 3:
                tipoPagamento = TipoPagamento.DINHEIRO;
                break;
            default:
                System.out.println("Opção inválida. Selecione um tipo de pagamento válido.");
                return;
        }

        // Receber o pagamento
        System.out.println("Insira o valor pago:");
        double valorPago = new Scanner(System.in).nextDouble();

        this.valorPago = valorPago;

        // Verificar se o valor pago é suficiente
        if (valorPago < valorTotal) {
            System.out.println("Valor pago insuficiente. Favor completar o valor.");
            return;
        }

        // Dar troco se necessário
        if (tipoPagamento == TipoPagamento.DINHEIRO && valorPago > valorTotal) {
            double troco = valorPago - valorTotal;
            System.out.println("Seu troco é de R$ " + troco);
        }

        // Finalizar o atendimento
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Valor pago: R$ " + valorPago);
        System.out.println("Tipo de pagamento: " + tipoPagamento);
    }

    private void calcularValorParcelas(int numeroParcelas) {
        double valorParcela = valorTotal / numeroParcelas;
        System.out.println("O valor de cada parcela é de R$ " + valorParcela);
    }

    public enum TipoPagamento {
        CARTAO_CREDITO,
        CARTAO_DEBITO,
        DINHEIRO
    }
}
