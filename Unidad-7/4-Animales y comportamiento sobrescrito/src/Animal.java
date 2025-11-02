/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DanteKaddarian
 */
public abstract class Animal {
    
    private String tipo; 
    private int cantPatas;
    private int edad;
    private String nombre;

    public Animal(String tipo, int cantPatas, int edad, String nombre) {
        this.tipo = tipo;
        this.cantPatas = cantPatas;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public void describirAnimal() {
        System.out.println(this.nombre + " " + this.edad + " " + this.tipo + " " + this.cantPatas + hacerSonido());
    };
    
    public abstract String hacerSonido();
}
