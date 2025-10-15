
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
        
        //1. Crear al menos 3 profesores y 5 cursos
        Universidad univ = new Universidad("Universidad Nacional de Tecnología");
        Profesor p1 = new Profesor("P001", "Ana López", "Programación");
        Profesor p2 = new Profesor("P002", "Carlos Gómez", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Laura Martínez", "Redes");
        Curso c1 = new Curso("C101", "Programación");
        Curso c2 = new Curso("C102", "Programación II");
        Curso c3 = new Curso("C201", "Base de Datos");
        Curso c4 = new Curso("C301", "Redes");
        Curso c5 = new Curso("C302", "Seguridad Informática");
        //2. Agregar profesores y cursos a la universidad
        univ.agregarProfesor(p1);
        univ.agregarProfesor(p2);
        univ.agregarProfesor(p3);
        univ.agregarCurso(c1);
        univ.agregarCurso(c2);
        univ.agregarCurso(c3);
        univ.agregarCurso(c4);
        univ.agregarCurso(c5);
        //3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        univ.asignarProfesorACurso("C101", "P001");
        univ.asignarProfesorACurso("C201", "P002");
        univ.asignarProfesorACurso("C301", "P003");
        //4. Listar cursos con su profesor y profesores con sus cursos.
        univ.listarCursos();
        System.out.println(SEPARADOR);
        univ.listarProfesores();
        System.out.println(SEPARADOR);
        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan
        //sincronizados.
        univ.asignarProfesorACurso("C201", "P001");
        //verificacion desde ambos lados
        univ.listarCursos();
        univ.listarProfesores();
        System.out.println(SEPARADOR);
        //6. Remover un curso y confirmar que ya no aparece en la lista del profesor
        univ.eliminarCurso("C301");
        univ.listarProfesores();
        System.out.println(SEPARADOR);
        //7. Remover un profesor y dejar profesor = null, 
        univ.eliminarProfesor("P001");
        univ.listarProfesores();
        //8. Mostrar un reporte: cantidad de cursos por profesor.
        univ.mostrarReporteCursosPorProfesor();
        
    }

}
