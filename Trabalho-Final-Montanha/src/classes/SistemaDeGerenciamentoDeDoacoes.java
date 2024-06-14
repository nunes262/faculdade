package classes;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentoDeDoacoes {
    private List<Doacao> doacoes;

    public SistemaDeGerenciamentoDeDoacoes() {
        this.doacoes = new ArrayList<>();
    }

    public void adicionarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public double calcularTotalDeDoacoes() {
        double total = 0;
        for (Doacao doacao : doacoes) {
            if (doacao.isDinheiro()) {
                total += (Double) doacao.getQuantidade();
            }
        }
        return total;
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }
}
