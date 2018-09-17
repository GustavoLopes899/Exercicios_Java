package aula08;

public class Teste {
    
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setSaldo(1000);
        try {
            c1.sacar(-200);
        } catch (SaldoException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
