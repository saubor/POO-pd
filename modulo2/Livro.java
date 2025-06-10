public class Livro {
    private String titulo;
    private String genero;
    private Autor autor;
    private boolean disponivel = true;

    public Livro(String titulo, String genero, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        autor.adicionarLivro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
