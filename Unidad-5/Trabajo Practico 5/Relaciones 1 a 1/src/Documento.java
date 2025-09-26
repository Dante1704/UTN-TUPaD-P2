
/**
 *
 * @author Dante Kaddarian
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    private Persona persona;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Persona persona) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha);
        this.persona = persona;
    }

    public void mostrarFirma(){
        if (firma != null) {
            System.out.println("El documento: " + titulo + " tiene la firma: " + firma);
        } else {
            System.out.println("el documento no esta firmado");
        }
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void mostrarPersona() {
        if (persona != null) {
            System.out.println("El documento: " + titulo + "tiene a la persona: " + persona.getNombre());
        } else {
            System.out.println("El documento no tiene una persona asociada");
        }
    }
        
}