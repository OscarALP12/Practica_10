// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;

// Clase que representa un punto en un plano cartesiano.
public class Punto {
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular la distancia entre dos puntos
    public double calcularDistancia(Punto p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)); // Pitágoras
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}