
/**
 *
 * @author Dante Kaddarian
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void mostrarArtista(){
        if(artista != null) {
            System.out.println("La cancion: " + titulo + " es del artista: " + artista.getNombre());
        } else {
            System.out.println("La cancion no tiene ningun artista asociado");
        }
    }
    
}
