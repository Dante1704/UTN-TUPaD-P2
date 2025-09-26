
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CitaMedica {
    private String fecha;
    private int hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, int hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public void mostrarPaciente() {
        if (paciente != null) {
            System.out.println("La cita medica " + fecha + " " + hora + "hs. corresponde al paciente " + paciente.getNombre()); 
        } else {
            System.out.println("La cita medica esta disponible para ser tomada");
        }
    }
    
    public void mostrarProfesional() {
        if (profesional != null) {
            System.out.println("La cita medica " + fecha + " " + hora + "hs. tiene al profesional " + profesional.getNombre()); 
        } else {
            System.out.println("La cita medica no tiene profesional asignado");
        }
    }
}
