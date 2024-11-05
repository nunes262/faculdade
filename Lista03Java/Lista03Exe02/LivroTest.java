import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void testEmprestar() {
        Livro livro = new Livro("Java para Iniciantes", "Autor A", 2);
        livro.emprestar();
        assertEquals(1, livro.getExemplaresDisponiveis(), "Exemplares should decrease by 1 after borrowing");
    }

    @Test
    void testEmprestarWhenNoExemplaresAvailable() {
        Livro livro = new Livro("Java para Iniciantes", "Autor A", 0);
        livro.emprestar();
        assertEquals(0, livro.getExemplaresDisponiveis(), "Exemplares should not go below 0");
    }

    @Test
    void testDevolver() {
        Livro livro = new Livro("Java para Iniciantes", "Autor A", 1);
        livro.devolver();
        assertEquals(2, livro.getExemplaresDisponiveis(), "Exemplares should increase by 1 after returning");
    }
}
