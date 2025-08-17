/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.calculadora.de.descuento.segun.categoria;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio4CalculadoraDeDescuentoSegunCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(input.nextLine());
        double precioFinal;
        System.out.println("Ingrese la categoria A,B, o C: ");
        String categoria = input.nextLine().toLowerCase();
        
        switch (categoria) {
            case "a":
                System.out.println("El precio ingresado original es: " + precio);
                System.out.println("El descuento aplicado es de 10%");
                precioFinal = precio - (precio * 10 / 100) ;
                System.out.println("El precio final es de: " + precioFinal);
                break;
            case "b":
                System.out.println("El precio ingresado original es: " + precio);
                System.out.println("El descuento aplicado es de 15%");
                precioFinal = precio - (precio * 15 / 100) ;
                System.out.println("El precio final es de: " + precioFinal);
                break;
            case "c":
                System.out.println("El precio ingresado original es: " + precio);
                System.out.println("El descuento aplicado es de 20%");
                precioFinal = precio - (precio * 20 / 100) ;
                System.out.println("El precio final es de: " + precioFinal);
                break;
            default:
                System.out.println("Categoria Incorrecta");;
        }
    }
    
}
