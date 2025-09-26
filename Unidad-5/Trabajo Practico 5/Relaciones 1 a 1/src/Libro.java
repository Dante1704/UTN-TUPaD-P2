
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial; //agregacion
    private Autor autor; //asociacion 1:1

    //se recibe a autor en el constructor que ya fue previamente creado
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void mostrarEditorial() {
        if (editorial != null) {
            System.out.println("El Libro " + titulo + " tiene editorial: " + editorial.getNombre());
        } else {
            System.out.println("El Libro no tiene editorial asociada");
        }
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarAutor() {
        if (autor != null) {
            System.out.println("El libro: " + titulo + " tiene autor: " + autor.getNombre());
        } else {
            System.out.println("El libro no tiene un autor asociado.");
        }
    }
    
    

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
    
    
}
