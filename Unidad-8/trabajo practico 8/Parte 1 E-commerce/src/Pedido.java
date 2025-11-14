
import java.util.ArrayList;


/**
 *
 * @author Dante Kaddarian
 */
public class Pedido implements Pagable {
    private Estado estado;
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<MedioDePago> mediosDePago = new ArrayList<>();
    private Cliente cliente;
    private double totalPedido;

    public Pedido(Cliente cliente) {
        this.estado = Estado.PENDIENTE; //pendiente por default
        this.cliente = cliente;
        
    }
    
    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void agregarMedioDePago(MedioDePago m) {
        this.mediosDePago.add(m);
    }
    

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : this.productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCliente("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }
    
    private void notificarCliente(String mensaje) {
        if (this.cliente != null) {
            this.cliente.notificar(mensaje);
        }
    }
    
    public void procesarPago() {
        
        double total = calcularTotal();
        System.out.println("Procesando pago de $ " + total);
        
        MedioDePago medio = this.mediosDePago.get(0);
        medio.procesarPago(total);
        
        cambiarEstado(Estado.PAGADO);
    }
    
    public void mostrarResumen() {
        System.out.println("RESUMEN DEL PEDIDO");
        System.out.println("Cliente: " + this.cliente.getNombreCompleto());
        System.out.println("Estado: " + this.estado);
        System.out.println("Productos:");
        for (Producto p : this.productos) {
            System.out.println("  - " + p.getNombre() + ": $" + p.getPrecio());
        }
        System.out.println("TOTAL: $" + calcularTotal());
    }
    
    public Estado getEstado() {
        return this.estado;
    }
    
}
