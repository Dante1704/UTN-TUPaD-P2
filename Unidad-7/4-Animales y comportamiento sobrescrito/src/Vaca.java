/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DanteKaddarian
 */
public class Vaca extends Animal {

    public Vaca(String tipo, int cantPatas, int edad, String nombre) {
        super(tipo, cantPatas, edad, nombre);
    }
    
    @Override
    public String hacerSonido() {
        return " Muuuu!";
    }
    
}
