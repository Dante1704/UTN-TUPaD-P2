
/**
 *
 * @author Damte Kaddarian
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; 
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void mostrarMotor() {
        if(motor != null) {
            System.out.println("El vehiculo: " + modelo + " tiene un motor: " + motor.getTipo());
        } else {
            System.out.println("El vehiculo no tiene motor");
        }   
    }
    
     public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    public String getModelo() {
        return modelo;
    }

    
}
