package aula05;

public class CamaroteSuperior extends Vip implements InterfaceIngresso {
    
    private double valorAdicional = 100;

    public CamaroteSuperior() {
        this.setValorCamarote(valorAdicional);
    }
    
    private void setValorCamarote(double adicional) {
        this.setAdicional(this.getValor() + adicional);
    }
    
    


}
