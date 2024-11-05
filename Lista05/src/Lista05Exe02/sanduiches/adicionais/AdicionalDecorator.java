package Lista05Exe02.sanduiches.adicionais;

import Lista05Exe02.sanduiches.Sanduiche;

public abstract class AdicionalDecorator implements Sanduiche {
    protected Sanduiche sanduiche;

    public AdicionalDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public void preparar() {
        sanduiche.preparar();
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double getCusto();
}
