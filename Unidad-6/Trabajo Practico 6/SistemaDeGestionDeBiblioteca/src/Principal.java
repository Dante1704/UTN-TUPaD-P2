
/**
 *
 * @author Dante Kaddarian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String SEPARADOR="--------------------------------------------";
        
        //1.
        Biblioteca biblioteca = new Biblioteca("Mi biblioteca");
        //2.
        Autor a1 = new Autor("A001", "Lucía Fernández", "Argentina");
        Autor a2 = new Autor("A002", "Kenji Takahashi", "Japón");
        Autor a3 = new Autor("A003", "Michael O'Connor", "Irlanda");
        //3.
        biblioteca.agregarLibro("978-950-01-0001-1", "El eco del silencio", 2018, a1);
        biblioteca.agregarLibro("978-4-06-123456-7", "Sombras de Kioto", 2020, a2);
        biblioteca.agregarLibro("978-0-14-312779-6", "La niebla del Atlántico", 2015, a3);
        biblioteca.agregarLibro("978-3-16-148410-0", "El código de la memoria", 2022, a1);
        biblioteca.agregarLibro("978-1-86197-876-9", "Horizontes digitales", 2015, a2);
        //4.
        System.out.println("Listado de libros: ");
        biblioteca.listarLibros();
        System.out.println(SEPARADOR);
        //5.
        Libro l1 = biblioteca.buscarLibroPorIsbn("978-0-14-312779-6");
        if (l1 != null ) {
            System.out.println("Libro encontrado:\n" + l1);
        } else {
            System.out.println("Libro no encontrado");
        }
        System.out.println(SEPARADOR);
        //6.
        biblioteca.listarLibrosPorAnio(2015);
        System.out.println(SEPARADOR);
        //7.
        biblioteca.eliminarLibro("978-3-16-148410-0");
        System.out.println("Libros Restantes:");
        biblioteca.listarLibros();
        System.out.println(SEPARADOR);
        //8.
        biblioteca.obtenerCantidadLibros();
        System.out.println(SEPARADOR);
        //9.
        biblioteca.mostrarAutoresDisponibles();
    }

}
