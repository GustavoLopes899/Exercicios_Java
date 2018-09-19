package lista05.exercicio01;

public class Circulo {
    
    private double raio;
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
