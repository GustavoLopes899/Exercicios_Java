package aula05;

public class Vip extends Ingresso implements InterfaceIngresso {

    private double adicional = 100;
    
    public Vip() {
        this.setValorVip(this.getValor() + this.adicional);
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
    
    private void setValorVip(double adicional) {
        this.setValor(this.getValor() + adicional);
    }
    
    private double getValorVip() {
        return this.getValor();
    }

    @Override
    public void tipoIngresso() {
        System.out.println("Ingresso VIP");
    }

}
