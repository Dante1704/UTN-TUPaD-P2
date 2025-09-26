
/**
 *
 * @author Dante Kaddarian
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        render.empaquetarProyecto();
        
    }
}
