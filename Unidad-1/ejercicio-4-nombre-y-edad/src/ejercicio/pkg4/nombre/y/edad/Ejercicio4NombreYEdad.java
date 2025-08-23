/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.nombre.y.edad;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio4NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese edad: ");
        int edad = Integer.parseInt(input.nextLine());
        System.out.println("Nombre Ingresado: " + nombre);
        System.out.println("Edad Ingresada: " + edad);
    }
    
}
