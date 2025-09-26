
/**
 *
 * @author Dante Kaddarian
 */
public class Reserva {
    private String fecha;
    private String hora;
    private ClienteRestaurant cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public void setCliente(ClienteRestaurant cliente) {
        this.cliente = cliente;
    }
    
    public void mostrarCliente() {
        if(cliente != null) {
            System.out.println("La Reserva para la fecha: " + fecha + " corresponde al cliente:  " + cliente.getNombre());
        } else {
            System.out.println("La reserva: " + fecha + " " + hora + " esta disponible");
        }
    } 
    
    public void mostrarMesa() {
        if (mesa != null) {
            System.out.println("La reserva para la fecha: " + fecha + " " + hora + " tiene la mesa: " + mesa.getNumero());
        } else {
            System.out.println("La reserva para la fecha: " + fecha + " " + hora + " no tiene una mesa asignada");
        }
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
}
