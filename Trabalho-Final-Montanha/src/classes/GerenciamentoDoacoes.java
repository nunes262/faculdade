package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDoacoes {
    private List<Doacao> doacoes;

    public GerenciamentoDoacoes() {
        this.doacoes = new ArrayList<>();
    }

    public void adicionarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public int calcularTotalDeDoacoes() {
        int total = 0;
        for (Doacao doacao : doacoes) {
            total += 1;
        }
        return total;
    }

    public List<Doacao> getDoacoes() {
        return doacoes;
    }
}
