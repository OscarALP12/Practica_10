// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_8.Ejercicio_2;

// Clase que representa un edificio.
public class Edificio implements HuellaCarbono {

    // Atributos
    private String nombre;
    private String direccion;
    private String tipo; // Empresarial, residencial, etc.

    // Atributos para la Huella de Carbono del edificio
    private double electricidad;
    private double consumoGas;

    // Factores de conversión para electricidad y gas
    private static final double FACTOR_ELECTRICO = 0.444;
    private static final double FACTOR_GAS = 2.1;

    // Constructor
    public Edificio(String nombre, String direccion, String tipo, double electricidad, double consumoGas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipo = tipo;
        this.electricidad = electricidad;
        this.consumoGas = consumoGas;
    }

    // Getters y setters para los atributos del edificio
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  // Implementación del método de la interfaz para la clase Edificio
  @Override
  public double getHuellaCarbono() {
    return (electricidad * FACTOR_ELECTRICO) + (consumoGas * FACTOR_GAS);
  }

  // Método toString para la clase Edificio
  @Override
  public String toString() {
    return "Edificio [nombre: " + nombre + ", direccion: " + direccion + ", tipo: " + tipo + "]";
  }
}
