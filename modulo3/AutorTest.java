import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void testPublicacaoLivro() {
        Autor autor = new Autor("Jessica Felix", 34, false);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        assertDoesNotThrow(() -> autor.publicar("Java Avançado"));
    }

    @Test
    void testPublicacaoArtigo() {
        Autor autor = new Autor("Alan Turing", 41, true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        assertDoesNotThrow(() -> autor.publicar("Compiladores Modernos"));
    }

    @Test
    void testSemEstrategia() {
        Autor autor = new Autor("Outro Autor", 30, false);
        assertDoesNotThrow(() -> autor.publicar("Nada acontece")); // imprime aviso
    }
}
