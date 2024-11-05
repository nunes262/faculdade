package Lista05Exe02;

import Lista05Exe02.criadores.Hamburgueria;
import Lista05Exe02.criadores.HamburgueriaVegana;
import Lista05Exe02.sanduiches.Sanduiche;
import Lista05Exe02.sanduiches.adicionais.Alface;
import Lista05Exe02.sanduiches.adicionais.QueijoVegano;
import Lista05Exe02.sanduiches.adicionais.Tomate;

public class Lista05Exe02 {
    public static void main(String[] args) {
        Hamburgueria hamburgueriaVegana = new HamburgueriaVegana();

        System.out.println("Pedido de Hambúrguer Vegano:");
        Sanduiche hamburguerVegano = hamburgueriaVegana.pedirSanduiche("hamburguervegano");
        if (hamburguerVegano != null) {
            hamburguerVegano = new Alface(hamburguerVegano);
            hamburguerVegano = new Tomate(hamburguerVegano);
            hamburguerVegano = new QueijoVegano(hamburguerVegano);
            System.out.println("Descrição: " + hamburguerVegano.getDescricao());
            System.out.println("Custo Total: R$ " + hamburguerVegano.getCusto());
        }

        System.out.println("\nPedido de Sanduíche de Legumes Grelhados:");
        Sanduiche sanduicheDeLegumes = hamburgueriaVegana.pedirSanduiche("sanduichedelegumesgrelhados");
        if (sanduicheDeLegumes != null) {
            sanduicheDeLegumes = new Tomate(sanduicheDeLegumes);
            sanduicheDeLegumes = new QueijoVegano(sanduicheDeLegumes);
            System.out.println("Descrição: " + sanduicheDeLegumes.getDescricao());
            System.out.println("Custo Total: R$ " + sanduicheDeLegumes.getCusto());
        }

        System.out.println("\nPedido de Wrap de Falafel:");
        Sanduiche wrapDeFalafel = hamburgueriaVegana.pedirSanduiche("wrapdefalafel");
        if (wrapDeFalafel != null) {
            wrapDeFalafel = new Alface(wrapDeFalafel);
            wrapDeFalafel = new Tomate(wrapDeFalafel);
            System.out.println("Descrição: " + wrapDeFalafel.getDescricao());
            System.out.println("Custo Total: R$ " + wrapDeFalafel.getCusto());
        }
    }
}
