package lista03.exercicio02;

public class TestaTributavel {
    
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca();
        ContaCorrente c2 = new ContaCorrente();
        SeguroDeVida c3 = new SeguroDeVida();
        
        c1.setSaldo(1000);
        c1.depositar(250);
        c1.sacar(100);
        c1.obterInfo();
        System.out.println();
        
        c2.setSaldo(800);
        c2.sacar(100);
        c2.obterInfo();
        System.out.printf("Tributos: R$%.2f\n", c2.calculaTributos());
        System.out.println();
        
        c3.setValor(2500);
        System.out.printf("Tributos: R$%.2f\n", c3.calculaTributos());
    }

}
