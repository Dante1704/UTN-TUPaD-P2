
import java.util.ArrayList;
/**
 *
 * @author Dante Kaddarian
 */
public class Cliente implements Notificable {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    @Override 
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }
       
}

