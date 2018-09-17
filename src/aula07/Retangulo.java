package aula07;

public class Retangulo extends Quadrilatero implements FormaGeometrica {

    private double altura, base;

    public Retangulo(double altura, double base) {
        super(altura, altura, base, base);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public void area() {
        double areaTotal = this.altura * this.base;
        System.out.printf("Área: %.2f\n", areaTotal);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
