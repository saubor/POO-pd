import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoTest {

    @Test
    public void testCriacaoEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(usuario, Arrays.asList(livro), dataRetirada, dataDevolucao);

        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(1, emprestimo.getLivros().size());
        assertEquals("Java Basics", emprestimo.getLivros().get(0).getTitulo());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertFalse(livro.isDisponivel());
    }
}
