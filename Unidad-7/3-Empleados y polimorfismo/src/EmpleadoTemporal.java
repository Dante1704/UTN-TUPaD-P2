/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DanteKaddarian
 */
public class EmpleadoTemporal extends Empleado {
    
    @Override
    public double calcularSueldo(double sueldoHora) {
       return sueldoHora * 160; 
    } 
}
