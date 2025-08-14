/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9.corregir.codigo;
 import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio9CorregirCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); // ERROR: esta leyendo un entere cuando fue declarado un String
        //Correccion:
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
    

