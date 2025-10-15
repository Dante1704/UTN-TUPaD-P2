
/**
 *
 * @author Dante Kaddarian
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria; //asoc 1:1

    public Producto(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }


    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void mostrarCategoria() {
        if(this.categoria != null) {
            System.out.println("El producto " + this.nombre + " tiene la categoria " + this.categoria);
        } else {
            System.out.println("El producto " + this.nombre + " no tienen categoria asociada.");
        }
    }
    
    public String mostrarProducto(){
        return this.toString();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" +
                precio + ", cantidad=" + cantidad + ", categoria=" + categoria +
                '}';
    }
    
    
}
