// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_8.Ejercicio_2;
import java.util.ArrayList;
import java.util.List;

// Clase que representa un punto en un plano cartesiano.
public class Main {

  public static void main(String[] args) {
    // Instanciamos un auto, un edificio y una bicicleta
    List<HuellaCarbono> listaDeObjetos = new ArrayList<>();

    HuellaCarbono auto1 = new Auto("Toyota", "Corolla", "Sedán", 100.0);
    HuellaCarbono edificio1 = new Edificio("Edificio X, Anexo FI", "Circuito Exterior, Ciudad Universitaria", "Educacional", 200.0, 50.0);
    HuellaCarbono bicicleta1 = new Bicicleta("Trek", "Tarmac", "Montaña");

    listaDeObjetos.add(auto1);
    listaDeObjetos.add(edificio1);
    listaDeObjetos.add(bicicleta1);
    
    for (HuellaCarbono objeto : listaDeObjetos) {
      System.out.println(objeto);
      System.out.println(objeto.getHuellaCarbono());
    }
  }
}