/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.modificacion.array.precios;

/**
 *
 * @author DNYNM
 */
public class Ejercicio12ModificacionArrayPrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] preciosProductos = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios Originales: ");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println(preciosProductos[i]);
        };
        preciosProductos[2] = 50.0;
        System.out.println("Precios Modificados: ");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println(preciosProductos[i]);
        };
    }
    
}
