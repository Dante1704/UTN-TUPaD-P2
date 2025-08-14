/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.division;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio8Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero: ");
        int num2 = Integer.parseInt(input.nextLine());
        int resultadoDivisionEntera = num1 / num2;
        System.out.println("El resultado de la division entera es: " + resultadoDivisionEntera);
        double resultadoDivisionDecimal = ((double) num1) / num2; //casting
        System.out.println("El resultado de la division decimal es: " + resultadoDivisionDecimal);
    }
    
}
