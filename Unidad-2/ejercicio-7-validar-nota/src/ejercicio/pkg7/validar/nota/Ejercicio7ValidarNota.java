/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.validar.nota;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio7ValidarNota {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nota;
        do {            
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota >=0 && nota <=10);
        System.out.println("Nota guardada correctamente.");
    }
}
