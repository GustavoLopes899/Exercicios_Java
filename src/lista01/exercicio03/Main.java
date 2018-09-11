package lista01.exercicio03;

public class Main {
    
    public static void main(String args[]) {
        ContaCorrente c1 = new ContaCorrente();
        c1.setNome("Gustavo");
        c1.setSaldo(1000);
        c1.sacar(950);
        c1.infoContaCorrente();
        
        ContaCorrente c2 = new ContaCorrente();
        c2.setNome("Lopes");
        c2.setSaldo(500);
        c2.depositar(600);
        c2.infoContaCorrente();
        
        ContaCorrente c3 = new ContaCorrente();
        c3.setNome("Pereira");
        c3.setSaldo(200);
        c3.infoContaCorrente();
    }

}
