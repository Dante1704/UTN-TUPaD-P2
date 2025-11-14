
/**
 *
 * @author Dante Kaddarian
 */
public class TarjetaCredito extends MedioDePago implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }
    
    @Override
    public void procesarPago(double monto) {
        double montoFinal = calcularMontoConDescuento(monto);
        System.out.println("Pago procesado con Tarjeta de Crédito");
        System.out.println("   Titular: " + titular);
        System.out.println("   Numero: " + this.getNumero());
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
        System.out.println("Descuento del " + porcentaje + "% aplicado en Tarjeta de Credito");
    }
}
