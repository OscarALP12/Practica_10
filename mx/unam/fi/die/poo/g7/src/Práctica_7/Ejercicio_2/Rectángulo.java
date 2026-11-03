// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public class Rectángulo extends Paralelogramo {

  // Constructor
  public Rectángulo(Punto p1, Punto p2, Punto p3, Punto p4) {
    super(p1, p2, p3, p4);
  }

  // Método para calcular el área del rectángulo (base * altura)
  @Override
  public double calcularArea() {
    double base = getP1().calcularDistancia(getP2());
    double altura = getP1().calcularDistancia(getP4());
    return base * altura;
  }
}