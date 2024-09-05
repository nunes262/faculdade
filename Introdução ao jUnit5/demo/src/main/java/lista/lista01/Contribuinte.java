package lista.lista01;

public class Contribuinte {
    private int idade;
    private char sexo;
    private int tempoContribuicao;

    public Contribuinte(int idade, char sexo, int tempoContribuicao) {
        this.idade = idade;
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
    }

    public boolean podeAposentar() {
        if (sexo == 'F') {
            return idade >= 62 && tempoContribuicao >= 15;
        } else if (sexo == 'M') {
            return idade >= 65 && tempoContribuicao >= 20;
        }
        return false;
    }
}
