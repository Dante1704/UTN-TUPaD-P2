/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author DNYNM
 */
public class Mascota {
    String nombre;
    String especie;
    int edad = 0;
    
       void mostrarInfo() {
        System.out.println("nombre: " + nombre + " especie: " + especie + " edad: " + edad);
    };
    
    void cumplirAnios() {
        edad += 1;
    };
}
