
/**
 *
 * @author Dante Kaddarian
 */
public class CodigoQR {
    private String valor;
    private Usuario persona;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setPersona(Usuario persona) {
        this.persona = persona;
    }
    
    public void mostarPersona() {
        System.out.println("El codigo:\n" + valor + "\n esta asociado a la persona: " + persona.getNombre() );
    }
}
