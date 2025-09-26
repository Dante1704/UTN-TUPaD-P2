
/**
 *
 * @author Dante Kaddarian
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; //agregacion
    private Usuario usuario;

    //se recibe a bateria en el constructor que ya fue previamente creada
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void mostrarBateria() {
        if (bateria != null) {
            System.out.println("El celular " + marca + " " + modelo + " tiene la bateria: " + bateria.getModelo());
        } else {
            System.out.println("El celular no tiene bateria");
        }
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    //Esta clase conoce a la clase Usuario
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Si no se añade la condición de prevención
        if (usuario != null && usuario.getCelular()!= this) {
            usuario.setCelular(this); // Llama a setCoche en Matricula
        }
    }

    public String getModelo() {
        return modelo;
    }
    

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
}
