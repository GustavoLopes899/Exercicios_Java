package lista02.exercicio05;

import lista02.exercicio03.Ingresso;
import java.util.Scanner;
import lista02.exercicio03.CamaroteSuperior;

public class TesteEx03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ingresso;
        Ingresso ing = null;
        do {
            System.out.println("Qual o tipo de ingresso:");
            System.out.println("1 - Normal");
            System.out.println("2 - VIP");
            System.out.printf("Opção: ");
            ingresso = input.nextInt();
        } while (ingresso != 1 && ingresso != 2);
        switch (ingresso) {
            case 1: {
                ing = new Ingresso();
                break;
            }
            case 2: {
                do {
                    System.out.println("Qual o tipo de ingresso VIP:");
                    System.out.println("1 - Camarote superior");
                    System.out.println("2 - Camarote inferior");
                    System.out.printf("Opção: ");
                    ingresso = input.nextInt();
                } while (ingresso != 1 && ingresso != 2);
                switch(ingresso) {
                    case 1: {
                        ing = new CamaroteSuperior();
                        break;
                    }
                    case 2: {
                        ing = new CamaroteSuperior();
                        break;
                    }
                }
            
            }
        }
        ing.imprimeValor();
    }

}
