/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author DNYNM
 */
public class Gallina {
    private String idGallina;
    private int edad = 0;
    private int huevosPuestos = 0;
    
    public void ponerHuevo(){
        huevosPuestos++;
    };
    
    public void envejecer(){
        edad++;
    };
    
    public void mostrarEstado(){
        System.out.println("id: " + idGallina + " edad: " + edad + " huevos puestos: " + huevosPuestos);
    }
}
