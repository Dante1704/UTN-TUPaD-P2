
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Dante Kaddarian
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>(); //agregacion 1:N
    }
    
    public void agregarProducto(Producto p) {
       this.productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto.mostrarProducto());
        }
    }
    
    private int cantProductos() {
        return this.productos.size();
    }
    
    public Producto buscarProductoPorId(String id) {
        Producto productoEncontrado = null;
        int i = 0;
        while (i < cantProductos() && !this.productos.get(i).getId().equalsIgnoreCase(id)) {
            i++;
        }
        if( i < cantProductos() ) {
            productoEncontrado = this.productos.get(i);
        }
        return productoEncontrado;
    }
    
    public Producto eliminarProducto(String id) {
        Producto p = this.buscarProductoPorId(id);
        if(p != null) {
            this.productos.remove(p);
        }
        return p;
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = this.buscarProductoPorId(id);
        if(p != null) {
            p.setCantidad(nuevaCantidad);
        }
    }
    
    public Collection<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
                if(producto.getCategoria().equals(categoria)) {
                    productosFiltrados.add(producto);
                }
        }
        return Collections.unmodifiableCollection(productosFiltrados);
    }
    
    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : this.productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }
    
    public Producto obtenerProductoConMayorStock() {
        Producto p = this.productos.get(0);
        for (Producto producto : this.productos) {
            if(producto.getCantidad() > p.getCantidad()) {
                p = producto;
            }
        }
        return p;
    }
    
    public Collection<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if(producto.getPrecio() <= max && producto.getPrecio() >= min) {
                productosFiltrados.add(producto);
            }
        }
        return Collections.unmodifiableCollection(productosFiltrados);
    }
    
    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] cat = CategoriaProducto.values(); //dependencia de uso
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }
    }
}
