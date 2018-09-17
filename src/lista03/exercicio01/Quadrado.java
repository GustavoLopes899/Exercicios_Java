package lista03.exercicio01;

public class Quadrado implements AreaCalculavel {

    private double lado;
    
    public Quadrado(double lado) {
        this.setLado(lado);
}

    @Override
    public double calcularArea() {
        double area;
        area = this.getLado() * this.getLado();
        System.out.printf("Área do quadrado de lado %.2f: %.2f\n", this.getLado(), area);
        return area;
    }

    public double getLado() {
        return lado;
    }

    private void setLado(double lado) {
        this.lado = lado;
    }

}
