package lista04.exercicio03;

import aula08.Conta;
import aula08.SaldoException;

public class Exercicio03 {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setSaldo(1000);
        try {
            minhaConta.sacar(1500);
        } catch (SaldoException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
