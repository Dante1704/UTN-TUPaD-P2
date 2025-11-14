
/**
 *
 * @author Dante Kaddarian
 */
public abstract class MedioDePago implements Pago {
    public double descuentoAplicado = 0;
    
    public double calcularMontoConDescuento(double monto) {
        return monto - (monto * descuentoAplicado / 100);
    }
}
