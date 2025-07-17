import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testCriacaoAutor() {
        Autor autor = new Autor("Turing", "Britânico");
        assertEquals("Turing", autor.getNome());
        assertEquals("Britânico", autor.getNacionalidade());
    }

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("Turing", "Britânico");
        Livro livro = new Livro("Máquina Enigma", autor, "História", true);
        autor.adicionarLivro(livro);

        assertEquals(1, autor.getLivrosEscritos().size());
        assertEquals("Máquina Enigma", autor.getLivrosEscritos().get(0).getTitulo());
    }
}
