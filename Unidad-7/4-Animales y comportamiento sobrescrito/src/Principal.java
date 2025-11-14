
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
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Gato("Gato", 4, 2, "Ofelia"));
        animales.add(new Perro("Perro", 4, 5, "Tomy"));
        animales.add(new Vaca("Vaca", 4, 10, "Lola"));
        
        for (Animal animal : animales) {
            animal.describirAnimal();
        }
    }
    
}
