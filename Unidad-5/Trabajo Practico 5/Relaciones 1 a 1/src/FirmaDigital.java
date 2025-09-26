
/**
 *
 * @author Dante Kaddarian
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + '}';
    }
    
}
