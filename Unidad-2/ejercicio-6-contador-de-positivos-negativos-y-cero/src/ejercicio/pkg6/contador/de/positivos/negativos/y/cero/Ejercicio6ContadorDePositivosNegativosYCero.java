/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.contador.de.positivos.negativos.y.cero;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio6ContadorDePositivosNegativosYCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = Integer.parseInt(input.nextLine());
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        };
        System.out.println("Positivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
    }
    
}
