package lista.lista01;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PessoaTest {
    @Test
    public void CalcularImc() {
        Pessoa pessoa = new Pessoa(80, 1.72);
        assertArrayEquals(27.04, pessoa.calcularIMC(), 0.01);
    }
}
