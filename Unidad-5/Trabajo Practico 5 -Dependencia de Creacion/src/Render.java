
/**
 *
 * @author Dante Kaddarian
 */
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public void empaquetarProyecto(){
        System.out.println("Empaquetando proyecto: " + proyecto.getNombre() + " con formato: " + formato);
    } 

}
