
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
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta());
        empleados.add(new EmpleadoTemporal());
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("El saldo es " + empleado.calcularSueldo(12500.00));
            } else {
                System.out.println("El saldo es " + empleado.calcularSueldo(10000.00));
            }   
        }
    } 
}
