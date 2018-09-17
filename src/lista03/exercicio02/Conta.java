package lista03.exercicio02;

public class Conta {

    private static int codigo = 1;
    private int conta;
    private double saldo = 0;

    public Conta() {
        this.setConta(codigo);
        codigo++;
    }
    
    public void sacar(double valor) {
        if (valor <= 0 || valor > this.getSaldo()) {
            throw new IllegalArgumentException("Valor incorreto.");
        }
        this.setSaldo(saldo - valor);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor incorreto.");
        }
        this.setSaldo(saldo + valor);
    }

    public void obterInfo() {
        System.out.printf("Código: %d\n", this.getConta());
        System.out.printf("Saldo da conta: R$%.2f\n", this.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    private void setConta(int conta) {
        this.conta = conta;
    }
    
    

}
