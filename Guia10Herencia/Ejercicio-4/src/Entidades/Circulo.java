/*
    Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
    dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
    dos métodos para calcular el área, el perímetro y el valor de PI como constante.

    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
    calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
    resultado final.
    
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
*/

package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas  {

    double radio;
    double diametro;

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
    }

    @Override
    public void calcularArea(double radio, double diametro) {
        System.out.println("El area del circulo dado es : " + (PI * Math.pow(radio, 2)));
    }

    @Override
    public void calcularPerimetro(double radio, double diametro) {
        System.out.println("El perimetro del circulo dado es : " + PI * diametro);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
}
