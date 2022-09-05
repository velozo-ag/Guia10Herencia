/*
    Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.

    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
    siguiente:
*/

package Entidades;

public class Animal {
    
    String nombre;
    String alimento;
    int edad;
    String raza;
    
    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public void Alimentarse(){
        System.out.println("Alimentandose...");
    }
    
}
