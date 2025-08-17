/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericicio.pkg2.mayor.de.pkg3.numeros;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejericicio2MayorDe3Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE; // -2147483648 min valor posible
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un numero entero: ");
            int num = Integer.parseInt(input.nextLine());
            if (num > mayor){
                mayor = num; 
            };
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
