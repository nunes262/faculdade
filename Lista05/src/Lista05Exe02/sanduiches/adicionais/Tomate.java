package Lista05Exe02.sanduiches.adicionais;

import Lista05Exe02.sanduiches.Sanduiche;

public class Tomate extends AdicionalDecorator {
    public Tomate(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Tomate";
    }

    @Override
    public double getCusto() {
        return sanduiche.getCusto() + 0.30;
    }
}