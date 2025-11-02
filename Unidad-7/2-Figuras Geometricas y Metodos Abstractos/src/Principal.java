
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author DanteKaddarian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear un array de figuras y mostrar el área de cada una usando
        //polimorfismo. 
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(2.0, "Circulo"));
        figuras.add(new Rectangulo(2.5, 5, "Rectangulo"));
        
        mostrarAreaFiguras(figuras);
    }

    private static void mostrarAreaFiguras(ArrayList<Figura> f) {
        for (Figura figura : f) {
           figura.mostrarInfo();
        }
    }   
}