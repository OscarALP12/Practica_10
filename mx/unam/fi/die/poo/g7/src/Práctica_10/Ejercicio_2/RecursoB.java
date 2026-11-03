// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_10.Ejercicio_2;

public class RecursoB {

    private String nombre = "RecursoB";
    // Método Sincronizado que no permite a otros hilos acceder al recurso mientras está siendo utilizado por uno.
    public synchronized void usarRecurso(RecursoA recursoA) {
        System.out.println("RecursoB está siendo utilizado por " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simula el uso del recurso
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " intenta acceder a un método de RecursoA");
        recursoA.metodoExterno();
    }

    public synchronized void metodoExterno() {
        System.out.println(Thread.currentThread().getName() + " ha ejecutado el método externo de " + this.nombre);
    }
}