import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livrosEscritos = new ArrayList<>();
    private boolean ehUsuario;
    private EstrategiaPublicacao estrategiaPublicacao;

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

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar(String titulo) {
        if (estrategiaPublicacao == null) {
            System.out.println("Nenhuma estratégia definida para publicação.");
        } else {
            estrategiaPublicacao.publicar(titulo);
        }
    }
}
