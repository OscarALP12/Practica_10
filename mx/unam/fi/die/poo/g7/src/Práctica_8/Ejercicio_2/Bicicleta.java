// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_8.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public class Bicicleta implements HuellaCarbono {

    // Atributos 
    private String marca;
    private String modelo;
    private String tipo; // Montaña, carretera, urbana, etc.

    // Constructor
    public Bicicleta(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    // Getters y setters para los atributos de la bicicleta
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

  // Implementación del método de la interfaz para la clase Bicicleta
  @Override
  public double getHuellaCarbono() {
    return 0.0;
  }

  // Método toString para la clase Bicicleta
  @Override
  public String toString() {
    return "Bicicleta [marca: " + marca + ", modelo: " + modelo + ", tipo: " + tipo + "]";
  }
}
