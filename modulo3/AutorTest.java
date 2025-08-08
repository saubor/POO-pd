import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    @Test
    void testEhUsuario() {
        Autor autor = new Autor("Alan Turing", 41, true);
        assertTrue(autor.isEhUsuario());
        autor.setEhUsuario(false);
        assertFalse(autor.isEhUsuario());
    }
}
