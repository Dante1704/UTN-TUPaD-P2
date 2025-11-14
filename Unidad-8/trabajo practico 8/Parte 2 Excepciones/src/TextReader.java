
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Dante Kaddarian
 */
public class TextReader {
   public void mostrarTexto(String ruta) throws FileNotFoundException, IOException {
       File archivoDeTexto = new File(ruta);
       BufferedReader br = new BufferedReader(new FileReader(archivoDeTexto) );
       System.out.println(br.readLine());
   }
}
