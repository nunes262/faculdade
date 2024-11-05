package Lista05Exe02.sanduiches;

public class HamburgerVegano implements Sanduiche {
    @Override
    public void preparar() {
        System.out.println("Preparando um hambúrguer vegano com patty de plantas.");
    }

    @Override
    public String getDescricao() {
        return "Hambúrguer Vegano";
    }

    @Override
    public double getCusto() {
        return 5.00;
    }
}