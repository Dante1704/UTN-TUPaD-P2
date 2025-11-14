
/**
 *
 * @author Dante Kaddarian
 */
public class PayPal extends MedioDePago implements PagoConDescuento {
    private String cuenta;
    private String titular;

    public PayPal(String cuenta, String titular) {
        this.cuenta = cuenta;
        this.titular = titular;
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = calcularMontoConDescuento(monto);
        System.out.println("Pago procesado con PayPal");
        System.out.println("   Cuenta: " + cuenta);
        System.out.println("   Titular: " + titular);
        if (descuentoAplicado > 0) {
            System.out.println("   Monto original: $" + monto);
            System.out.println("   Descuento: " + descuentoAplicado + "%");
            System.out.println("   Monto final: $" + montoFinal);
        } else {
            System.out.println("   Monto: $" + monto);
        }
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado en PayPal");
    }  
}
