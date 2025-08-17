/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9.calculo.de.envio.y.total.compra;

import java.util.Scanner;

/**
 *
 * @author DNYNM
 */
public class Ejercicio9CalculoDeEnvioYTotalCompra {

    /**
     * @param args the command line arguments
     */
    final static int NACIONAL = 5;
    final static int INTERNACIONAL = 10;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double pesoPaquete,precio,costoEnvio;
        String zona;
        System.out.println("Ingrese el precio: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del paquete: ");
        pesoPaquete = Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envio");
        zona = input.nextLine().toLowerCase();
        costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        System.out.println("El costo de envio es: " + costoEnvio);
        calcularTotalCompra(precio, costoEnvio);
    };
    static double calcularCostoEnvio(double peso, String zona){
        return zona == "nacional" ? NACIONAL*peso : INTERNACIONAL*peso;
        
    };
    static void calcularTotalCompra(double precioProducto, double costoEnvio){
        double totalCompra = precioProducto + costoEnvio;
        System.out.println("El total a pagar es: " + totalCompra);
    };
    
}
