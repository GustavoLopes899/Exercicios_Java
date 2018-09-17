package lista03.exercicio02;

public class SeguroDeVida implements Tributavel {
    
    private double valor;

    @Override
    public double calculaTributos() {
        double tributos = 42;
        return tributos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
