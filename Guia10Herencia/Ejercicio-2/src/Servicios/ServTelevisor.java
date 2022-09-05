/*
    Se debe crear también una subclase llamada Televisor con los siguientes atributos:
    resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
    heredados.
    
    Los constructores que se implementarán serán:
    
    • Un constructor vacío.
    
    • Un constructor con la resolución, sintonizador TDT y el resto de los atributos
    heredados. Recuerda que debes llamar al constructor de la clase padre.

    Los métodos que se implementara serán:
    
    • Método get y set de los atributos resolución y sintonizador TDT.
    
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
*/

package Servicios;
import Entidades.Televisor;

public final class ServTelevisor extends ServElectrodomestico{

    public Televisor crearTelevisor(){

        Televisor tv = new Televisor();
        int tieneSintonizador;

        crearElectrodomestico(tv);

        System.out.print("Ingresar tamaño en pulgadas del televisor: \n > ");
        tv.setResolucion(input.nextInt());

        System.out.print("Ingrese si tiene sintonizador: (1)Si (2)No \n > ");
        tieneSintonizador = input.nextInt();

        if(tieneSintonizador == 1){
            tv.setSintonizadorTDT(true);
        }else{
            tv.setSintonizadorTDT(false);
        }

        return tv;

    }

    public int precioFinal1(Televisor tv){

        int pf = super.precioFinal(tv);

        if(tv.getResolucion() > 40){

            System.out.println("Resolucion - "+pf * 0.3);
            pf += pf * 0.3;

        }

        if(tv.isSintonizadorTDT()){
            pf += 500;
            System.out.println("Sintonizador - "+500);
        }

        // System.out.println("Al precio original de la television, se le han sumado $" + pf  + ".");

        return (tv.getPrecio() + pf);

    }
    
}
