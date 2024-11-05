package Lista05Exe02.sanduiches.adicionais;

import Lista05Exe02.sanduiches.Sanduiche;

public class Alface extends AdicionalDecorator {
    public Alface(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Alface";
    }

    @Override
    public double getCusto() {
        return sanduiche.getCusto() + 0.50;
    }
}
