/*
    Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
    consumo energético (letras entre A y F) y peso.
    
    Los constructores que se deben implementar son los siguientes:
    
    • Un constructor vacío.
    
    • Un constructor con todos los atributos pasados por parámetro.

    Los métodos a implementar son:
    
    • Métodos getters y setters de todos los atributos.
    
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
    
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.

    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
    
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio. Esta es la lista de precios:

    LETRA   PRECIO
    A       $1000
    B       $800
    C       $600
    D       $500
    E       $300
    F       $100

    PESO                PRECIO
    Entre 1 y 19 kg     $100
    Entre 20 y 49 kg    $500
    Entre 50 y 79 kg    $800
    Mayor que 80 kg     $1000

*/

package Entidades;

public class Electrodomestico {

    int precio;
    int peso;
    String color;
    char consumoEnergetico;

    public Electrodomestico() {
    }
    
    public Electrodomestico(int precio, int peso, String color, char consumoEnergetico) {
        this.precio = precio + 1000;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Electrodomestico [color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso
                + ", precio=" + precio + "]";
    }

}
