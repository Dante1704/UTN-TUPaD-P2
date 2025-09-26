
/**
 *
 * @author Dante Kaddarian
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Esta clase conoce a la clase Celular
    public void setCelular(Celular celular) {
        this.celular = celular; // Si no se añade la condición de prevención:
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + (celular != null ? celular.getModelo() : "null") + '}';
    }
    
}
