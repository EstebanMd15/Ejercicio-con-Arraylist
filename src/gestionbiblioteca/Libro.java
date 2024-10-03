
package gestionbiblioteca;


public class Libro {
    
    private String isbn;
    private String titulo;
    private Autor autor;
    private int nPaginas;

    public Libro(String isbn, String titulo, Autor autor, int nPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    @Override
    public String toString(){
        return "El libro "+ titulo + " tiene "+ nPaginas + " paginas y fue escrito por: "
                + autor;
    }
    
}
