// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public class Cuadrado extends Rectángulo {

  // Constructor
  public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {
    super(p1, p2, p3, p4);
  }

  // Método para calcular el área del cuadrado (lado * lado) 
  @Override
  public double calcularArea() {
    double lado = getP1().calcularDistancia(getP2());
    return lado * lado;
  }
}