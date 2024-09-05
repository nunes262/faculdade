package lista.lista01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RetanguloTest {

    @Test
    public void calculaArea() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(50, retangulo.calculaArea(), 0.01);
    }

    @Test
    public void calculaPerimetro() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(30, retangulo.calcularPerimetro(), 0.01);
    }
}
