// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public class Trapezoide extends Cuadrilátero {

  // Constructor
  public Trapezoide(Punto p1, Punto p2, Punto p3, Punto p4) {
    super(p1, p2, p3, p4);
  }

  // Método para calcular el área del trapezoide (baseMayor + baseMenor) * altura / 2
  @Override
  public double calcularArea() {
    double baseMayor = getP1().calcularDistancia(getP2());
    double baseMenor = getP3().calcularDistancia(getP4());
    double altura = Math.abs(getP1().getY() - getP4().getY());
    return (baseMayor + baseMenor) * altura / 2;
  }
}