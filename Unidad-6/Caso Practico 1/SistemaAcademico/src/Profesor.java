
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Dante Kaddarian
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List <Curso> cursos = new ArrayList<>(); //asoc bidireccional

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public void agregarCurso(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }
        
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
        }
        
        if (curso.getProfesor() != this) {
            curso.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if (curso != null && this.cursos.contains(curso)) {
            this.cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  (sin cursos asignados)");
        } else {
            for (Curso c : cursos) {
                System.out.println("  - " + c.getNombre() + " (" + c.getCodigo() + ")");
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre +
                ", especialidad=" + especialidad + ", cant. cursos= " + this.cursos.size() + '}';
    }
    
    
}
