package lista02.exercicio03;

public class Ingresso {
    
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public void imprimeValor() {
        System.out.printf("Valor do ingresso: R$%.2f", this.valor);
    }

}
