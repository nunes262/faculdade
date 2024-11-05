package Lista05Exe02.sanduiches;

public class WrapDeFalafel implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando um wrap de falafel.");
    }

    @Override
    public String getDescricao() {
        return "Wrap de Falafel";
    }

    @Override
    public double getCusto() {
        return 4.00;
    }
}