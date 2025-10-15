
import java.lang.reflect.Array;


/**
 *
 * @author Dante Kaddarian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String SEPARADOR="--------------------------------------------";
        
        Producto p1 = new Producto("P001", "Smartphone Samsung A35", 250000.0, 15);
        p1.setCategoria(CategoriaProducto.ELECTRONICA);

        Producto p2 = new Producto("P002", "Camiseta Nike Dry-Fit", 45000.0, 30);
        p2.setCategoria(CategoriaProducto.ROPA);

        Producto p3 = new Producto("P003", "Cereal Integral Granix", 3800.0, 50);
        p3.setCategoria(CategoriaProducto.ALIMENTOS);

        Producto p4 = new Producto("P004", "Licuadora Philips 700W", 82000.0, 10);
        p4.setCategoria(CategoriaProducto.HOGAR);

        Producto p5 = new Producto("P005", "Televisor LG 55'' OLED", 790000.0, 5);
        p5.setCategoria(CategoriaProducto.ELECTRONICA);
        
        Producto[] productos = {p1, p2, p3, p4, p5};
                
        
        Inventario inv = new Inventario();
        
        for (int i = 0; i < 5; i++) {
            inv.agregarProducto(productos[i]);
        }
        
        inv.listarProductos();
        System.out.println(SEPARADOR);
        Producto prodEncontrado = inv.buscarProductoPorId("P005");
        System.out.println("Producto buscado: " + prodEncontrado);
        System.out.println(SEPARADOR);
        System.out.println("Productos Por Categoria: ");
        for (Producto producto : inv.filtrarPorCategoria(CategoriaProducto.ROPA)) {
            System.out.println(producto);
        }
        System.out.println(SEPARADOR);
        Producto productoEliminado = inv.eliminarProducto("P001");
        System.out.println("Producto eliminado: " + productoEliminado);
        System.out.println("Productos Restantes: ");
        inv.listarProductos();
        System.out.println(SEPARADOR);
        inv.actualizarStock("P002", 100);
        Producto prodEncontrado2 = inv.buscarProductoPorId("P002");
        System.out.println("Producto buscado: " + prodEncontrado2);
        System.out.println(SEPARADOR);
        System.out.println("Stock Total: " + inv.obtenerTotalStock());
        System.out.println(SEPARADOR);
        System.out.println("Producto con mayor stock: " + inv.obtenerProductoConMayorStock());
        System.out.println(SEPARADOR);
        System.out.println("Productos Filtrados por precio: ");
        for (Producto producto : inv.filtrarProductosPorPrecio(3800.0, 82000.0)) {
            System.out.println(producto);
        }
        System.out.println(SEPARADOR);
        System.out.println("Categorias disponibles: ");
        inv.mostrarCategoriasDisponibles();
    }

}
