package aula01_vetor;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        final int tam = 3;
        double higher = 0;
        Scanner input = new Scanner(System.in);
        double salary[] = new double[tam];
        for (int i = 0; i < tam; i++) {
            System.out.printf("Enter with a salary: ");
            salary[i] = input.nextDouble();
            if (salary[i] > higher)
                higher = salary[i];
        }
        System.out.printf("Higher salary: R$%.2f\n", higher);
    }

}
