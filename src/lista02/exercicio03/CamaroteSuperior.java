package lista02.exercicio03;

public class CamaroteSuperior extends Vip implements InterfaceIngresso {
    
    private double valorAdicional = 100;

    public CamaroteSuperior() {
        this.setValor(this.getValor() + valorAdicional);
    }

}