/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author DNYNM
 */
public class NaveEspacial {
    private String nombre;
    private int combustible = 0;
    
    public void despegar(){
        if (combustible < 20) {
            System.out.println("No hay combustible para despegar");
        } else {
            combustible-=10;
            System.out.println("Despegue Exitoso");
        };
    };
    
    public void avanzar(int distancia) {
        if (distancia > combustible ) {
            System.out.println("No hay suficiente combustible");
        } else {
            combustible-=distancia;
            System.out.println("Avanzando: " + distancia);
        };
    };
    
    public void recargar(int combustible){
        if((combustible + this.combustible) < 50) {
            System.out.println("El cumbustible es mayor que el limite");
        } else {
            this.combustible += combustible;
            System.out.println("Recarga exitosa");
        }
    };
}
