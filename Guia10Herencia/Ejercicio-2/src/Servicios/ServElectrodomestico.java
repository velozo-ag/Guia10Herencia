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

package Servicios;
import java.util.Scanner;
import Entidades.Electrodomestico;

public class ServElectrodomestico {
    
    Scanner input = new Scanner(System.in);

    char[] letras = {'A','B','C','D','E','F'};
    int[] precioSegunLetra = {1000,800,600,500,300,100};
    String[] colores = {"blanco","negro","rojo","azul","gris"};

    public char comprobarConsumoEnergetico(char letra){


        if(letra >= 65 && letra <= 70){

            return letras[letra - 65];

        }else{

            return letras[5];

        }

    }

    public String comprobarColor(String color){

        boolean colorCorrecto = false;

        for (String aux : colores) {
            if(aux.equals(color)){
                colorCorrecto = true;
                break;
            }
        }

        if(!colorCorrecto){
            return colores[0];
        }

        return color;

    }

    public Electrodomestico crearElectrodomestico(Electrodomestico elec){

        System.out.print("Ingrese el precio: \n > ");
        elec.setPrecio(input.nextInt());

        System.out.print("Ingrese el peso: \n > ");
        elec.setPeso(input.nextInt());
        
        System.out.print("Ingrese el color: [blanco, negro, rojo, azul, gris] \n > ");
        elec.setColor(comprobarColor(input.next()));
        
        System.out.print("Ingrese el consumo energetico: [A, B, C, D, E, F] \n > ");
        elec.setConsumoEnergetico(comprobarConsumoEnergetico(input.next().charAt(0)));

        return elec;

    }

    public int precioFinal(Electrodomestico elec){

        int pf = 0;
        int peso = elec.getPeso();
        char consumoElectrico = elec.getConsumoEnergetico();

        pf += precioSegunLetra[consumoElectrico - 65];

        System.out.println("Consumo Electrico - "+precioSegunLetra[consumoElectrico - 65]);

        if(peso < 20){
            pf += 100;
            System.out.println("Peso - "+100);
        }else if(peso < 50){
            pf += 500;
            System.out.println("Peso - "+500);
        }else if(peso < 80){
            pf += 800;
            System.out.println("Peso - "+800);
        }else{
            pf += 1000;
            System.out.println("Peso - "+1000);
        }

        return pf;

    }

}
