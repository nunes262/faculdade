package lista.lista01;

public class Aluno {
    private int A1;
    private int A2;
    private int A3;
    private int AI = -1;

    public Aluno(int A1, int A2, int A3) {
        this.A1 = A1;
        this.A2 = A2;
        this.A3 = A3;
    }

    public void setAI(int AI) {
        this.AI = AI;
    }

    public int calcularPontuacaoFinal() {
        if (AI > -1) {
            if (AI > A1 && AI <= A2) {
                return AI + A2 + A3;
            } else if (AI > A2 && AI <= A1) {
                return A1 + AI + A3;
            } else if (AI > A1 && AI > A2) {
                return AI + A2 + A3;
            }
        }
        return A1 + A2 + A3;
    }

    public int verificarAprovacao() {
        int total = calcularPontuacaoFinal();
        if (total >= 70) {
            if (AI == -1) {
                return 1; // Aprovado sem AI
            } else {
                return 2; // Aprovado com AI
            }
        } else {
            return 3; // Reprovado
        }
    }
}
