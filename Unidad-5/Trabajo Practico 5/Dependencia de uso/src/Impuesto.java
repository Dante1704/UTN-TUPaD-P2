
/**
 *
 * @author Dante Kaddarian
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
    
    public void mostrarContribuyente(){
        if(contribuyente != null) {
            System.out.println("El impuesto de $" + monto + " esta asociado al contribuyente: " + contribuyente.getNombre());
        } else {
            System.out.println("El impuesto no tiene ningun contribuyente asociado");
        }
    }
    
}
