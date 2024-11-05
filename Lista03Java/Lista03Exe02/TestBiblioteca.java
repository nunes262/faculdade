import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class TestBiblioteca {

    @InjectMocks
    private Biblioteca biblioteca;

    @Mock
    private Livro livro;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        biblioteca = new Biblioteca();
    }

    @Test
    void testAdicionarLivro() {
        biblioteca.adicionarLivro(livro);
        assertDoesNotThrow(() -> biblioteca.adicionarLivro(livro),
                "Livro should be added to the library without exceptions");
    }

    @Test
    void testEmprestarLivroAvailable() {
        when(livro.getTitulo()).thenReturn("Java para Iniciantes");
        when(livro.getExemplaresDisponiveis()).thenReturn(1);

        biblioteca.adicionarLivro(livro);
        biblioteca.emprestarLivro("Java para Iniciantes");

        verify(livro).emprestar();
    }

    @Test
    void testEmprestarLivroNotAvailable() {
        when(livro.getTitulo()).thenReturn("Java para Iniciantes");
        when(livro.getExemplaresDisponiveis()).thenReturn(0);

        biblioteca.adicionarLivro(livro);

        Exception exception = assertThrows(LivroNaoDisponivelException.class, () -> {
            biblioteca.emprestarLivro("Java para Iniciantes");
        });

        assertEquals("O livro 'Java para Iniciantes' não está disponível para empréstimo no momento.",
                exception.getMessage());
    }

    @Test
    void testEmprestarLivroNotFound() {
        Exception exception = assertThrows(LivroNaoEncontradoException.class, () -> {
            biblioteca.emprestarLivro("Inexistente");
        });

        assertEquals("Livro 'Inexistente' não foi encontrado na biblioteca.", exception.getMessage());
    }

    @Test
    void testDevolverLivro() {
        when(livro.getTitulo()).thenReturn("Java para Iniciantes");

        biblioteca.adicionarLivro(livro);
        biblioteca.devolverLivro("Java para Iniciantes");

        verify(livro).devolver();
    }

    @Test
    void testDevolverLivroNotFound() {
        Exception exception = assertThrows(LivroNaoEncontradoException.class, () -> {
            biblioteca.devolverLivro("Inexistente");
        });

        assertEquals("Livro 'Inexistente' não foi encontrado na biblioteca.", exception.getMessage());
    }
}
