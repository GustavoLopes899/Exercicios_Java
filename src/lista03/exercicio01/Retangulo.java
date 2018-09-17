package lista03.exercicio01;

public class Retangulo implements AreaCalculavel {
    
    private double altura, base;
    
    public Retangulo(double altura, double base) {
        this.setAltura(altura);
        this.setBase(base);
    }
    
    @Override
    public double calcularArea() {
        double area;
        area = this.getAltura() * this.getBase();
        System.out.printf("Área do retângulo de altura %.2f e base %.2f: %.2f\n", this.getAltura(), this.getBase(), area);
        return area;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    private void setBase(double base) {
        this.base = base;
    }

}
