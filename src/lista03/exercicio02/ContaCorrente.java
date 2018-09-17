package lista03.exercicio02;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        double tributos;
        tributos = this.getSaldo() * 0.01;
        return tributos;
    }

}
