package Lista05Exe02.sanduiches;

public class SanduicheDeLegumesGrelhados implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando um sanduíche de legumes grelhados.");
    }

    @Override
    public String getDescricao() {
        return "Sanduíche de Legumes Grelhados";
    }

    @Override
    public double getCusto() {
        return 4.50;
    }
}