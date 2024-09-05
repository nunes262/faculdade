package lista.lista01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {

    @Test
    public void testAprovadoSemAI() {
        Aluno aluno = new Aluno(20, 20, 35);
        assertEquals(1, aluno.verificarAprovacao());
    }

    @Test
    public void testReprovado() {
        Aluno aluno = new Aluno(10, 10, 10);
        assertEquals(3, aluno.verificarAprovacao());
    }

    @Test
    public void testAprovadoComAI() {
        Aluno aluno = new Aluno(21, 19, 20);
        aluno.setAI(30);
        assertEquals(2, aluno.verificarAprovacao());
    }

    @Test
    public void testReprovadoComAI() {
        Aluno aluno = new Aluno(21, 19, 20);
        aluno.setAI(25);
        assertEquals(3, aluno.verificarAprovacao());
    }
}
