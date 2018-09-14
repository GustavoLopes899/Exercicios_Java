package lista02.exercicio02;

public class Rica extends Pessoa {
    
    private double dinheiro;
    
    public void fazCompras() {
        System.out.println("O rico faz compras.");
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

}
