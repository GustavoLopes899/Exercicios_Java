package aula06;

import java.util.Scanner;

public class TesteAnimais {
    
    final static int tam = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Animal animais[] = new Animal[10];
        for (int i = 0; i < tam; i++) {
            do {
                System.out.printf("Escolha um animal para a posição %d do vetor:\n", i);
                System.out.println("1 - Cachorro");
                System.out.println("2 - Cavalo");
                System.out.println("3 - Preguiça");
                System.out.printf("Opção: ");
                opcao = input.nextInt();
            } while (opcao < 1 && opcao > 3);
            switch(opcao) {
                case 1: {
                    animais[i] = new Cachorro();
                    break;
                }
                case 2: {
                    animais[i] = new Cavalo();
                    break;
                }
                case 3: {
                    animais[i] = new Preguica();
                    break;
                }
            }
        }
        System.out.println("\nSons:");
        for (int i = 0; i < tam; i++) {
            animais[i].emitirSom();            
        }
    }

}
