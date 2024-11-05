package Lista05Exe01;

import Lista05Exe01.movimentos.MovimentoEmL;
import Lista05Exe01.pecas.Bispo;
import Lista05Exe01.pecas.Cavalo;
import Lista05Exe01.pecas.Peao;
import Lista05Exe01.pecas.Peca;

public class Lista05Exe01 {
    public static void main(String[] args) {
        Peca knight = new Cavalo();
        Peca pawn = new Peao();
        Peca bishop = new Bispo();

        System.out.println("Cavalo move:");
        knight.mover();

        System.out.println("\nPeao move:");
        pawn.mover();

        System.out.println("\nBispo move:");
        bishop.mover();
        System.out.println("\nMudando a estratégia de movimento do peão para formato L:");
        pawn.setMovimento(new MovimentoEmL());
        pawn.mover();
    }
}
