/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5.suma.de.numeros.pares;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio5SumaDeNumerosPares {

    /**
     * @param args the command line arguments
     */
    final static int CORTE = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese un numero o cero para finalizar: ");
        int numero = Integer.parseInt(input.nextLine());
        while (numero != CORTE) {            
            if (numero % 2 == 0) {
              suma += numero;
            };
            System.out.println("Ingrese un numero o cero para finalizar: ");
            numero = Integer.parseInt(input.nextLine());
            
        };
        System.out.println("La suma de los numeros pares es: " + suma);
    };
    
}
