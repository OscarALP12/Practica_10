// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_8.Ejercicio_2;

// Clase que representa un auto.
public class Auto implements HuellaCarbono {

    // Atributos
    private String marca;
    private String modelo;
    private String tipo; // Sedán, SUV, hatchback, etc.

    // Atributos para calcular la huella de carbono del auto
    private double distanciaRecorrida;

    // Factores de conversión para electricidad y gas
    private static final double FACTOR_EMISIÓN = 0.20;

    // Constructor
    public Auto(String marca, String modelo, String tipo, double distanciaRecorrida) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.distanciaRecorrida = distanciaRecorrida;
    }

    // Getters y setters para los atributos del auto
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  // Implementación del método de la interfaz para la clase Auto
  @Override
  public double getHuellaCarbono() {
    return distanciaRecorrida * FACTOR_EMISIÓN;
  }

  // Método toString para la clase Auto
  @Override
  public String toString() {
    return "Auto [marca: " + marca + ", modelo: " + modelo + ", tipo: " + tipo + "]";
  }
}
