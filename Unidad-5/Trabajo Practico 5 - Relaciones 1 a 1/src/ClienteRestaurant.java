
/**
 *
 * @author Dante Kaddarian
 */
public class ClienteRestaurant {
    private String nombre;
    private String telefono;

    public ClienteRestaurant(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ClienteRestaurant{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
