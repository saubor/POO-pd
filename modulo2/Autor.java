import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livrosEscritos = new ArrayList<>();
    private boolean ehUsuario;

    public Autor(String nome, int idade, boolean ehUsuario) {
        super(nome, idade);
        this.ehUsuario = ehUsuario;
    }

    public void adicionarLivro(Livro livro) {
        livrosEscritos.add(livro);
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }

    public boolean isEhUsuario() {
        return ehUsuario;
    }

    public void setEhUsuario(boolean ehUsuario) {
        this.ehUsuario = ehUsuario;
    }
}
