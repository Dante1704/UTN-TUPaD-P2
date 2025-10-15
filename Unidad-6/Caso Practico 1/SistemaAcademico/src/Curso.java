
/**
 *
 * @author Dante Kaddarian
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; //asoc bidireccional

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) {
            return;
        }
        
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        this.profesor = profesor;
        
        if (profesor != null && !profesor.getCursos().contains(this)) {
            this.profesor.agregarCurso(this);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre +
                ", profesor=" + profesor + '}';
    }

    
}
