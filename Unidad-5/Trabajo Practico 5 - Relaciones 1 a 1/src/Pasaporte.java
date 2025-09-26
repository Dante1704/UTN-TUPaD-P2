
/**
 *
 * @author Dante Kaddarian
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; //composicion 1 a 1
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato); //composicion 1 a 1 se crea en el constructor
    }
    
    //Esta clase conoce a la clase Titular
    public void setTitular(Titular titular) {
        this.titular = titular; // Si no se añade la condición de prevención:
        if (titular != null && titular.getPasaporte()!= this) {
            titular.setPasaporte(this); // Llama a setCoche en Matricula
        }
    }

    public Titular getTitular() {
        return titular;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void mostrarFoto() {
        System.out.println("El Pasaporte " + numero + " tiene la siguiente foto: " + foto);
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    
}
