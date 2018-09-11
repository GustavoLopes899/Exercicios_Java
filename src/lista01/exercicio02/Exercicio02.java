/*
    Está falhando quando está ordenado crescente, mas temos números iguais começando
    Ex: {2, 2, 3} -> ERRO 
*/

package lista01.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        final int tam = 3;
        int vetor[] = new int[tam];
        int x;
        for (int i = 0; i < vetor.length; i++) {
            do {
                System.out.printf("Entre com o valor[%d]: ", i + 1);
                vetor[i] = input.nextInt();
            } while (vetor[i] < 0);
        }
        do {
            System.out.printf("Entre com o valor de x: ");
            x = input.nextInt();
        } while (x < 0);
        verificarVetor(vetor);
        compararX(x, vetor);
    }

    public static boolean verificarVetor(int vetor[]) {
        boolean crescente = false, decrescente = false, desordenado = false;
        if (vetor[0] < vetor[1]) {
            crescente = true;
        } else {
            decrescente = true;
        }
        for (int i = 0; i < vetor.length-1; i++) {
            if (crescente) {
                if (vetor[i] <= vetor[i + 1]) {
                } else {
                    desordenado = true;
                    break;
                }
            } else {
                if (vetor[i] >= vetor[i + 1]) {
                } else {
                    desordenado = true;
                    break;
                }
            }

        }
        if (desordenado) {
            System.out.println("O vetor não está ordenado.");
            return false;
        }
        if (crescente) {
            System.out.println("O vetor está em ordem crescente.");
        } else {
            if (decrescente) {
                System.out.println("O vetor está em ordem decrescente.");
            } else {

            }
        }
        return true;
    }

    public static void compararX(int x, int vetor[]) {
        int maior = 0, menor = 0, igual = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > x) {
                maior++;
            } else if (vetor[i] < x) {
                menor++;
            } else {
                igual++;
            }
        }
        System.out.printf("Maior que x: %d\n", maior);
        System.out.printf("Menor que x: %d\n", menor);
        System.out.printf("Igual a x: %d\n", igual);
    }

}
