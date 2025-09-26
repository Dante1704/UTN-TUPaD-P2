
/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private TitularCuenta titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo,ultimaModificacion );
    }

    public String getCbu() {
        return cbu;
    }

    
    public void setClave(String codigo, String ultimaModificacion) {
        this.clave = new ClaveSeguridad(codigo,ultimaModificacion );
    }
    
    public void mostrarClave() {
        if (clave != null)  {
            System.out.println("La cuenta: " + cbu + " tiene la clave asociada: " + clave.getCodigo());
        } else {
            System.out.println("La cuenta no tiene nignguna clave asociada");
        }
    }

    public TitularCuenta getTitular() {
        return titular;
    }

    public void setTitular(TitularCuenta titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
    
    

}
