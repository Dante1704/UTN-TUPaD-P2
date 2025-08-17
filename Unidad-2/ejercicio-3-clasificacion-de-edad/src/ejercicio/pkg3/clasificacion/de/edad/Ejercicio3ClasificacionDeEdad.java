/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.clasificacion.de.edad;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio3ClasificacionDeEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if (edad >=0 && edad < 12) {
            System.out.println("Eres un Niño");
        } else if (edad >= 12 && edad <= 18) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
        } else if (edad >= 59) {
            System.out.println("Eres un Adulto mayor");
        } else {
            System.out.println("Edad no es valida");
        }
    }
    
}
