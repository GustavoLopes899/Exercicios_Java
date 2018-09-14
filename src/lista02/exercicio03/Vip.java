package lista02.exercicio03;

public class Vip extends Ingresso implements InterfaceIngresso {

    private double adicional = 100;
    
    public Vip() {
        this.setValor(this.getValor() + this.adicional);
    }

    @Override
    public void imprimeValor() {
        System.out.printf("Valor do ingresso: R$%.2f\n", this.getValorVip());
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    private double getValorVip() {
        return this.getValor();
    }

    @Override
    public void tipoIngresso() {
        System.out.println("Ingresso VIP");
    }

}
