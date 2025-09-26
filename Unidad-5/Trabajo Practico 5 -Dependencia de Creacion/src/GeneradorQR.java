
/**
 *
 * @author Dante Kaddarian
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) {
        //dependencia de creacion
        CodigoQR qr = new CodigoQR(valor);
        qr.setPersona(usuario);
        qr.getValor();
        qr.mostarPersona();
    }
}
