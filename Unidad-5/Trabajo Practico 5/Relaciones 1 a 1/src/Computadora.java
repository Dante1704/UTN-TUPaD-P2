
/**
 *
 * @author Dante Kaddarian
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;   
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modelo, chipset);
    }
    
    public void mostrarPlacaMadre() {
        System.out.println("La compudadora tiene Placa Madre: " + placa);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this ) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String getMarca() {
        return marca;
    }

    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placa=" + placa + '}';
    }
     
    
}
