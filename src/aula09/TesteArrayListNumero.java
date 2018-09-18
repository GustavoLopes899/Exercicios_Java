package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList();
        final int tam = 3;
        int num;
        boolean done;
        for (int i = 0; i < tam; i++) {
            done = false;
            while (!done) {
                try {
                    System.out.printf("Entre com um número inteiro [%d de %d]: ", i+1, tam);
                    num = input.nextInt();
                    array.add(num);
                    done = true;
                } catch (java.util.InputMismatchException ex) {
                    System.out.println("Valor inválido, tente novamente...");
                    input.next();
                }
            }
        }
        for (int i : array) {
            switch(i) {
                case 10:
                case 100:
                case 1000:
                    System.out.println("Você ganhou um bônus de R$50.00");
                    break;
            }
        }
    }

}
