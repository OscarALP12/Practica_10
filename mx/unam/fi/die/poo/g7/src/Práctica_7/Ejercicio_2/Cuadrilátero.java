// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public abstract class Cuadrilátero {

  private Punto p1;
  private Punto p2;
  private Punto p3;
  private Punto p4;

  // Constructor
  public Cuadrilátero(Punto p1, Punto p2, Punto p3, Punto p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }

  // Getters
  public Punto getP1() {
    return p1;
  }

  public Punto getP2() {
    return p2;
  }

  public Punto getP3() {
    return p3;
  }

  public Punto getP4() {
    return p4;
  }

  // Setters
  public void setP1(Punto p1) {
    this.p1 = p1;
  }

  public void setP2(Punto p2) {
    this.p2 = p2;
  }

  public void setP3(Punto p3) {
    this.p3 = p3;
  }

  public void setP4(Punto p4) {
    this.p4 = p4;
  }

  // Método para mostrar los 4 puntos del cuadrilátero
  public void mostrarPuntos() {
    System.out.println("Punto 1: " + p1);
    System.out.println("Punto 2: " + p2);
    System.out.println("Punto 3: " + p3);
    System.out.println("Punto 4: " + p4);
  }

  // Método para calcular el perímetro del cuadrilátero
  public double calcularPerimetro() {
    return p1.calcularDistancia(p2) + p2.calcularDistancia(p3) + p3.calcularDistancia(p4) + p4.calcularDistancia(p1);
  }

  // Método para calcular el área que se modificará en los hijos
  public abstract double calcularArea(); 
}
