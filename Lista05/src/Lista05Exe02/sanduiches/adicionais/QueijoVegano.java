package Lista05Exe02.sanduiches.adicionais;

import Lista05Exe02.sanduiches.Sanduiche;

public class QueijoVegano extends AdicionalDecorator {
    public QueijoVegano(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Queijo Vegano";
    }

    @Override
    public double getCusto() {
        return sanduiche.getCusto() + 1.00;
    }
}