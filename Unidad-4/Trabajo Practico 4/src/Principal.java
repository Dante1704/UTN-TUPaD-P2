
/**
 *
 * @author Dante Kaddarian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Dante Kaddarian", "Desarrollador Web", 100000.0);
        System.out.println(empleado1);
        Empleado empleado2 = new Empleado("Juan Rodriguez", "Analista");
        System.out.println(empleado2);
        Empleado empleado3 = new Empleado("Alfonso Perez", "Diseñador");
        System.out.println(empleado3);
        empleado1.actualizarSalario(50000.00);
        System.out.println(empleado1);
        empleado2.actualizarSalario(5);
        System.out.println(empleado2);
        empleado3.actualizarSalario(10);
        System.out.println(empleado3);
        System.out.println("Total de Empleados: " + Empleado.mostrarTotalEmpleados());
        
    }

}
