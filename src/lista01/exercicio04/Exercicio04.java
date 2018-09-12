package lista01.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int tam = 5;
        boolean pg = true;
        double vetor[] = new double[tam];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d] = ", i);
            vetor[i] = input.nextDouble();            
        }
        double q = vetor[1]/vetor[0];
        for(int i = 2; i < vetor.length; i++) {
            if (vetor[i]/vetor[i-1] != q) {
                pg = false;
                break;
            }
        }
        System.out.printf("É uma PG: %b\n", pg);
    }

}
