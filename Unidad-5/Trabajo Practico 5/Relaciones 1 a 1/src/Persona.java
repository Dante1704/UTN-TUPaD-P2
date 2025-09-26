
/**
 *
 * @author Dante Kaddarian
 */
public class Persona {
    private String nombre;
    private String email;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
}
