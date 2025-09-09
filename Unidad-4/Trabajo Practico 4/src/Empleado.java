
/**
 *
 * @author Dante Kaddarian
 */
public class Empleado {
    private static int contadorIds = 0; //para que no se pisen
    private int id = 0;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; //propio de la clase
    
    //Constructores sobrecargados
    public Empleado (int id, String nombre, String puesto, double salario) {
        this.id = ++contadorIds; //aca incremento primero y asigno despues en la misma linea
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    };
    
    public Empleado (String nombre, String puesto) {
        id = ++contadorIds;
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 5000000; //por defecto
        Empleado.totalEmpleados++;
    };
    
    //Metodos sobrecargados
    public void actualizarSalario(int porcentaje) {
        double aumento = salario * porcentaje / 100;
        salario += aumento;
    };
    
    public void actualizarSalario(double aumento) {
        salario += aumento;
    };
    
    @Override
    public String toString() {
        return "Empleado{" + "id: " + id + " nombre: " + nombre + " puesto: " + puesto + " salario: " + salario + "}";
    };
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    };

    //getters and setters
    public int getId() {
        return id;
    }

    //no queremos actualizar el id del empleado
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
    
}
