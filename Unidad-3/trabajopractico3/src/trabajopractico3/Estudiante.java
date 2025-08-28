/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author DNYNM
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    void mostrarInfo() {
        System.out.println("nombre: " + nombre + " apellido: " + apellido + " curso: " + curso + " calificacion: " + calificacion);
    };
    
    void subirCalificacion(int puntos) {
        calificacion += puntos;
    };
    
    void bajarCalificacion(int puntos) {
        calificacion -= puntos;
    };
}
