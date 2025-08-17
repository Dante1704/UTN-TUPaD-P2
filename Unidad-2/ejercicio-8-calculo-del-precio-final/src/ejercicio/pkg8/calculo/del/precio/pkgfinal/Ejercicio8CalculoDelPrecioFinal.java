/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.calculo.del.precio.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio8CalculoDelPrecioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double precio,impuesto,descuento;
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el porcentaje de impuesto: ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el porcentaje de descuento: ");
        descuento = Double.parseDouble(input.nextLine());
        calcularPrecioFinal(precio, impuesto, descuento);
    }
    
    static void calcularPrecioFinal(double precio, double impuesto, double descuento){
        double precioFinal = precio + (precio*impuesto) - (precio*descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    };
}
