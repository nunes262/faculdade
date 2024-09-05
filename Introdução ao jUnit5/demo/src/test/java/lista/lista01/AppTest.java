package lista.lista01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
    @Test
    public void testPessoaIMC() {
        Pessoa pessoa = new Pessoa(80, 1.72);
        assertArrayEquals(27.04, pessoa.calcularIMC(), 0.01);
    }

    @Test
    public void testRetanguloAreaEPerimetro() {
        Retangulo retangulo = new Retangulo(5, 10);
        assertEquals(50, retangulo.calcularArea(), 0.01);
        assertEquals(30, retangulo.calcularPerimetro(), 0.01);
    }

    @Test
    public void testNomeCompleto() {
        Nome nome = new Nome("Dr.", "Pedro", "Nunes", "Oliveira");
        assertEquals("Dr. Pedro Nunes Oliveira", nome.getNomeCompleto());

        Nome nomeSemTitulo = new Nome(null, "Pedro", null, "Nunes");
        assertEquals("Pedro Oliveira", nomeSemTitulo.getNomeCompleto());
    }

    @Test
    public void testNumerosMinimoMaximo() {
        Numeros numeros = new Numeros(10, 5, 8);
        assertEquals(5, numeros.minimo());
        assertEquals(10, numeros.maximo());
    }

    @Test
    public void testTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4, 5, 6, 5);
        assertEquals(15, triangulo.calcularArea(), 0.01);
        assertEquals(12, triangulo.calcularPerimetro(), 0.01);
        assertEquals("Escaleno", triangulo.obterTipo());
    }

    @Test
    public void testContribuinteAposentadoria() {
        Contribuinte contribuinteHomem = new Contribuinte(65, 'M', 20);
        assertTrue(contribuinteHomem.podeAposentar());

        Contribuinte contribuinteMulher = new Contribuinte(62, 'F', 15);
        assertTrue(contribuinteMulher.podeAposentar());
    }

    @Test
    public void testAlunoPontuacaoEAprovacao() {
        Aluno aluno = new Aluno(21, 19, 20);
        assertEquals(60, aluno.calcularPontuacaoFinal());
        assertEquals(3, aluno.verificarAprovacao());

        aluno.setAI(30);
        assertEquals(71, aluno.calcularPontuacaoFinal());
        assertEquals(2, aluno.verificarAprovacao());
    }
}
