package aula05;

public class Ingresso {
    
    private double valor = 200;

    public double getValor() {
        return valor;
    }
    
    public void imprimeValor() {
        System.out.printf("Valor do ingresso: R$%.2f", this.valor);
    }

}
