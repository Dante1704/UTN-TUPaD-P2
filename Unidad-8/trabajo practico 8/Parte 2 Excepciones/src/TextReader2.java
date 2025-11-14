
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Dante Kaddarian
 */
public class TextReader2 {
    public void mostrarTexto(String ruta) {
       File archivoDeTexto = new File(ruta);
        try ( BufferedReader br = new BufferedReader(new FileReader(archivoDeTexto) ); ) { //se libera el recurso
             System.out.println(br.readLine());
        } catch (IOException ioe) {
            System.out.println("Error de E/S: " + ioe.getMessage());
            throw new RuntimeException("Error inesperado");
        }
    }
}
