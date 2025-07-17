import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriacaoUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNomeEIdade() {
        Usuario usuario = new Usuario("Ana", 18);
        usuario.setNome("Carlos");
        usuario.setIdade(30);

        assertEquals("Carlos", usuario.getNome());
        assertEquals(30, usuario.getIdade());
    }
}
