
/**
 *
 * @author Dante Kaddarian
 */
public class Persona {

    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }

        System.out.println("Edad válida: " + edad);
    }
}

