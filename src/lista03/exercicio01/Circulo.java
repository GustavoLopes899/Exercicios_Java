package lista03.exercicio01;

import static java.lang.Math.pow;

public class Circulo implements AreaCalculavel {
    
    private double raio;
    
    public Circulo(double raio) {
        this.setRaio(raio);
    }
    
    @Override
    public double calcularArea() {
        double area;
        area = Math.PI * pow(raio, 2);
        System.out.printf("Área do círculo de raio %.2f: %.2f\n", this.getRaio(), area);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    private void setRaio(double raio) {
        this.raio = raio;
    }

}
