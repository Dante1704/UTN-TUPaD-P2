
/**
 *
 * @author Dante Kaddarian
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; //agregacion 1:1

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) { //agregacion 1:1
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    } 

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    } 

    public Autor getAutor() {
        return autor;
    }
    
    public String mostrarInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo +
                ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }

}
