
/**
 *
 * @author Dante Kaddarian
 */
public class Pricipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Juan", "Perez");
        
        
        Pedido pedido1 = new Pedido(cliente1);
        System.out.println("Pedido creado para " + cliente1.getNombreCompleto());
        
        pedido1.agregarProducto(new Producto("Laptop", 1200.00));
        pedido1.agregarProducto(new Producto("Mouse", 25.00));
        pedido1.agregarProducto(new Producto("Teclado", 75.00));
        
        pedido1.mostrarResumen();
        
        //Pago con Tarjeta de Credito con descuento
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", "Juan Perez");
        tarjeta.aplicarDescuento(10); // 10% de descuento
        pedido1.agregarMedioDePago(tarjeta);
        pedido1.procesarPago();
        
        pedido1.cambiarEstado(Estado.LISTO);
        pedido1.cambiarEstado(Estado.DESPACHADO);
        
        //Nuevo pedido con PayPal
        Cliente cliente2 = new Cliente("Maria", "Gonzalez");
        
        Pedido pedido2 = new Pedido(cliente2);
        System.out.println("Pedido creado para " + cliente2.getNombreCompleto());

        pedido2.agregarProducto(new Producto("Celular", 800.00));
        pedido2.agregarProducto(new Producto("Funda", 15.00));
        
        pedido2.mostrarResumen();
        
        PayPal paypal = new PayPal("maria.gonzalez@email.com", "Maria Gonzalez");
        paypal.aplicarDescuento(5); // 5% de descuento
        pedido2.agregarMedioDePago(paypal);
        pedido2.procesarPago();
        
        pedido2.cambiarEstado(Estado.LISTO);
        pedido2.cambiarEstado(Estado.DESPACHADO);
    }

}
