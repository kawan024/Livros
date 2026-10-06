// Livro.java
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("O livro " + titulo + ", escrito por " + autor + ", possui " + paginas + " páginas.");
    }
}

// MainEx1.java
public class MainEx1 {
    public static void main(String[] args) {
        Livro meuLivro = new Livro("Dom Casmurro", "Machado de Assis", 256);
        meuLivro.exibirDetalhes();
    }
}