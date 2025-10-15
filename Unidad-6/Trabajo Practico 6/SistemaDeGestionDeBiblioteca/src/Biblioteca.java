
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Dante Kaddarian
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor)); //composicion 1:N
    }
    
    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator(); //por ser coleccion existe este metodo, sirve para todas las colecciones
        while (it.hasNext() && libroEncontrado == null) {
            Libro l1 = it.next();
            if (l1.getIsbn().equalsIgnoreCase(isbn)) {
                libroEncontrado = l1;
            }
        }
        return libroEncontrado;
    }
    
    private ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    
    public void listarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();
        librosEncontrados.addAll(this.filtrarLibrosPorAnio(anio));
        if (!librosEncontrados.isEmpty() ) {
            System.out.println("Libros del " + anio + ":");
            for (Libro librosEncontrado : librosEncontrados) {
                System.out.println(librosEncontrado);
            }
        } else {
            System.out.println("Libros no encontrados para el año solicitado.");
        }
    }
    
    public void eliminarLibro(String isbn) {
        Libro l = this.buscarLibroPorIsbn(isbn);
        this.libros.remove(l);
        if (l != null) {
            System.out.println("Libro Eliminado : " + l);
        } else {
            System.out.println("Libro no encontrado en la biblioteca");
        }
    }
    
    public void obtenerCantidadLibros() {
        System.out.println("Cantidad de libros: " + this.libros.size());
    }
    
    public void mostrarAutoresDisponibles() {
       if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
       
        HashSet<Autor> autores = new HashSet<>(); // para evitar repeticiones
        for (Libro libro : libros) {
            autores.add(libro.getAutor());
        }

        System.out.println("Autores disponibles en la biblioteca:");
        for (Autor autor : autores) {
            System.out.println(autor);
        } 
    }
}
