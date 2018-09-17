package aula07;

import static java.lang.Math.pow;

public class Circulo implements FormaGeometrica {

    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void perimetro() {
        double perimetroTotal = 2 * Math.PI * raio;
        System.out.printf("Perímetro do círculo: %.2f\n", perimetroTotal);
    }

    @Override
    public void area() {
        double areaTotal = Math.PI * pow(raio, 2);
        System.out.printf("Perímetro do círculo: %.2f\n", areaTotal);
    }

    public double getRaio() {
        return raio;
    }

}
