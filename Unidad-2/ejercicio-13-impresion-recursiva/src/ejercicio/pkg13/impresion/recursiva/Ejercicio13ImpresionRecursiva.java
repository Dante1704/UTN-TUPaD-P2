/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13.impresion.recursiva;

/**
 *
 * @author DNYNM
 */
public class Ejercicio13ImpresionRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] preciosProductos = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios Originales: ");
        mostrarPrecios(preciosProductos, 0);
        preciosProductos[0] = 100.0;
        System.out.println("Precios Modificados: ");
        mostrarPrecios(preciosProductos, 0);
    };
    
    static void mostrarPrecios(double[] precios, int index){
        if(index < precios.length) {
            System.out.println(precios[index]);
            index++;
            mostrarPrecios(precios, index);
        }
    };
    
}
