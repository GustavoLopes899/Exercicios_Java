package aula05;

public class Vip extends Ingresso implements InterfaceIngresso {

    private double adicional = 100;

    @Override
    public void imprimeValor() {
        System.out.printf("Valor do ingresso: R$%.2f\n", this.getValor() + this.getAdicional());
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void tipoIngresso() {
        System.out.println("Ingresso VIP");
    }

}
