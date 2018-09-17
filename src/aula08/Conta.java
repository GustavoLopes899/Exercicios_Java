package aula08;

public class Conta {
    
    private static int codigo = 1;
    private int numero;
    private double saldo;
    
    public Conta() {
        this.setNumero(codigo);
        codigo++;
    }
    
    public void sacar(double valor) throws SaldoException {
        if (valor <= 0 || valor > this.getSaldo()) {
            throw new SaldoException();
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
        System.out.printf("Código: %d\n", this.getNumero());
        System.out.printf("Saldo da conta: R$%.2f\n", this.getSaldo());
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
