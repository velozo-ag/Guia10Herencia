/*
    Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.

    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
    siguiente:
*/

package Main;
import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Main {
    
    public static void main(String[] args) {
        
        Animal perrito = new Perro("Chiquito", "Croquetas", 6, "Pitbull");
        
        Animal gatito = new Gato("Cali", "Pollo", 2, "Calico");
        
        Animal caballo = new Caballo("Roberto", "Pasto", 15, "Fino");
        
        gatito.Alimentarse();
        caballo.Alimentarse();
        perrito.Alimentarse();
        
    }

}
