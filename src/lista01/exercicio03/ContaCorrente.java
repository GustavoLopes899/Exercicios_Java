package lista01.exercicio03;

public class ContaCorrente {

    private static int codigo = 0;
    private String nome;
    private int numero;
    private double saldo;

    public ContaCorrente() {
        this.numero = ContaCorrente.codigo;
        System.out.printf("Conta número %d foi criada.\n", this.numero);
        ContaCorrente.codigo++;
    }
    
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor incorreto.\n");
        }
        this.saldo += valor;
        System.out.printf("Depósito efetuado com sucesso!\n");

    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor incorreto.\n");
        }
        if (valor + this.saldo * 0.05 > this.saldo) {
            System.out.printf("Saldo insuficiente.\n");
            return;
        }
        this.saldo -= valor;
        System.out.printf("Saldo efetuado com sucesso!\n");
    }

    public void infoContaCorrente() {
        System.out.printf("Conta número: %d\n", this.numero);
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("Saldo incorreto.\n");
        }
        this.saldo = saldo;
    }
}
