package lista.lista01;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return base * altura;
    }

    public double calculaPerimetro() {
        return 2 * (base + altura);
    }
}
