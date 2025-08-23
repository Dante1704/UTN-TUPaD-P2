/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5.operaciones;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio5Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = Integer.parseInt(input.nextLine());

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
      
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        
        double division;
        if (num2 != 0) {
            division = ((double) num1 )/ num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por 0.");
        }


        
    }
    
}
