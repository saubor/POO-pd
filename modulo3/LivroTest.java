import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Avançado", autor, "tecnologia", false);
        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Jess", livro.getAutor().getNome());
    }

    @Test
    public void testDisponibilidadeInicialTrue() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testDisponibilidadeInicialFalse() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Avançado", autor, "tecnologia", false);
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testEmprestarLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        livro.emprestar();
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testDevolverLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", false);
        livro.devolver();
        assertTrue(livro.isDisponivel());
    }
}
