package aula07;

public class Quadrado extends Quadrilatero implements FormaGeometrica {

    private double lado;

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }

    @Override
    public void area() {
        double areaTotal = this.lado * this.lado;
        System.out.printf("Área: %.2f\n", areaTotal);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
