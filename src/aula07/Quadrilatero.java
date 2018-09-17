package aula07;

public abstract class Quadrilatero implements FormaGeometrica {
    
    private double lados[] = new double[4];
    private double perimetroTotal = 0;
    
    public Quadrilatero(double lado0, double lado1, double lado2, double lado3) {
        lados[0] = lado0; 
        lados[1] = lado1; 
        lados[2] = lado2; 
        lados[3] = lado3; 
    }
    
    @Override
    public void perimetro() {
        for (int i = 0; i < 4; i++) {
            this.perimetroTotal += lados[i];
        }
        System.out.printf("Perímetro total: %.2f\n", this.perimetroTotal);
        
    }
    
    public double[] getLados() {
        return lados;
    }
    
}
