// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_10.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        RecursoA recursoA = new RecursoA();
        RecursoB recursoB = new RecursoB();

        Thread hilo1 = new Thread(() -> recursoA.usarRecurso(recursoB), "Hilo 1");
        Thread hilo2 = new Thread(() -> recursoB.usarRecurso(recursoA), "Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}