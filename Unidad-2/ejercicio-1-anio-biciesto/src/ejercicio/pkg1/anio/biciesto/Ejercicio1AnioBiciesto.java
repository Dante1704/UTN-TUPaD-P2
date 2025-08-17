/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.anio.biciesto;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio1AnioBiciesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = Integer.parseInt(input.nextLine());
        boolean esDivisiblePor4 = anio % 4 == 0;
        boolean esDivisiblePor100 = anio % 100 == 0;
        boolean esDivisiblePor400 = anio % 400 == 0;
        if ( (esDivisiblePor4 && !esDivisiblePor100) || esDivisiblePor400) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        };
    }
    
}
