// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_10.Ejercicio_2;

public class RecursoA {

    private String nombre = "RecursoA";
    // Método Sincronizado que no permite a otros hilos acceder al recurso mientras está siendo utilizado por uno.
    public synchronized void usarRecurso(RecursoB recursoB) {
        System.out.println("RecursoA está siendo utilizado por " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simula el uso del recurso
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " intenta acceder a un método de RecursoB");
        recursoB.metodoExterno();
    }

    public synchronized void metodoExterno() {
        System.out.println(Thread.currentThread().getName() + " ha ejecutado el método externo de " + this.nombre);
    }
}