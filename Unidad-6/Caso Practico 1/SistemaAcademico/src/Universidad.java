
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Dante Kaddarian
 */
public class Universidad {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>(); //composicion 1:N
    private List<Profesor> profesores = new ArrayList<>(); //asocioacion 1:N

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }
    
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profesor = buscarProfesorPorId(idProfesor);
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        curso.setProfesor(profesor);
    }
    
    public void listarProfesores() {
        for (Profesor profesor : this.profesores) {
            profesor.mostrarInfo();
            profesor.listarCursos();
        }
    }
    
    public void listarCursos() {
        for (Curso curso : this.cursos) {
            curso.mostrarInfo();
        }
    }
    
    private Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profesorEncontrado == null) {
            Profesor prof = it.next();
            if (prof.getId().equalsIgnoreCase(id)) {
                profesorEncontrado = prof;
            }
        }
        return profesorEncontrado;
    }
    
    private Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null) {
            Curso c = it.next();
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                cursoEncontrado = c;
            }
        }
        return cursoEncontrado;
    }
    
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        Profesor p = buscarProfesorPorId(c.getProfesor().getId());
        //se rompe la relacion
        p.eliminarCurso(c);
        this.cursos.remove(c);
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        
        if (profesor == null) {
            System.out.println("No se encontró el profesor con ID: " + id);
            return;
        }

        for (Curso curso : this.cursos) {
            Profesor profAsignado = curso.getProfesor();
            if (profAsignado != null && profAsignado.getId().equalsIgnoreCase(id)) {
                curso.setProfesor(null);
            }
        }

        this.profesores.remove(profesor);
    }
    
    public void mostrarReporteCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        System.out.println("=====================================================");
        for (Profesor profesor : profesores) {
            int cantidad = profesor.getCursos().size();
            System.out.println("Profesor: " + profesor.getNombre() + " cursos: " + cantidad);
            System.out.println("=====================================================");
        }
    }


}
