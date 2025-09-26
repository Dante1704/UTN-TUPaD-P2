
/**
 *
 * @author Dante Kaddarian
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjeta;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
