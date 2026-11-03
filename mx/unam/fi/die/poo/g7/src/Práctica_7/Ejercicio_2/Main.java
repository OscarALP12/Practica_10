// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_7.Ejercicio_2;
import java.util.Scanner;

// Clase que representa un punto en un plano cartesiano.
public class Main {

  // Método principal (main) de la clase Main
  public static void main(String[] args) {

    // Declaramos el scanner
    Scanner scanner = new Scanner(System.in);

    // Nuevo Cuadrado
    Cuadrado cuadrado = new Cuadrado(
        new Punto(0, 0),
        new Punto(5, 0),
        new Punto(5, 5),
        new Punto(0, 5)
    );

    // Nuevo Rectángulo
    Rectángulo rectángulo = new Rectángulo(
        new Punto(0, 0),
        new Punto(6, 0),
        new Punto(6, 4),
        new Punto(0, 4)
    );

    // Nuevo Paralelogramo
    Paralelogramo paralelogramo = new Paralelogramo(
        new Punto(0, 0),
        new Punto(6, 0),
        new Punto(8, 4),
        new Punto(2, 4)
    );

    // Nuevo Trapezoide
    Trapezoide trapezoide = new Trapezoide(
        new Punto(0, 0),
        new Punto(8, 0),
        new Punto(6, 4),
        new Punto(2, 4)
    );

    // Loop para solicitar que figura ver y la muestra
    System.out.println("Bienvenido al programa de figuras geométricas.");
    int opcion;
    do {
        System.out.println("Seleccione la opción:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Paralelogramo");
        System.out.println("4. Trapezoide");
        System.out.println("5. Salir");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado Cuadrado.");
                cuadrado.mostrarPuntos();
                System.out.println("Perímetro: " + cuadrado.calcularPerimetro());
                System.out.println("Área: " + cuadrado.calcularArea());
                break;
            case 2:
                System.out.println("Has seleccionado Rectángulo.");
                rectángulo.mostrarPuntos();
                System.out.println("Perímetro: " + rectángulo.calcularPerimetro());
                System.out.println("Área: " + rectángulo.calcularArea());
                break;
            case 3:
                System.out.println("Has seleccionado Paralelogramo.");
                paralelogramo.mostrarPuntos();
                System.out.println("Perímetro: " + paralelogramo.calcularPerimetro());
                System.out.println("Área: " + paralelogramo.calcularArea());
                break;
            case 4:
                System.out.println("Has seleccionado Trapezoide.");
                trapezoide.mostrarPuntos();
                System.out.println("Perímetro: " + trapezoide.calcularPerimetro());
                System.out.println("Área: " + trapezoide.calcularArea());
                break;
            case 5:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    } while (opcion != 5);
    scanner.close();
  }
}