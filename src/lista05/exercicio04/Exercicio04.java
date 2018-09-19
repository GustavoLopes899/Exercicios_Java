package lista05.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConjuntoDePalavras cj = new ConjuntoDePalavras();
        cj.inserePalavras();
        System.out.printf("Entre com uma string: ");
        String s = input.nextLine();
        System.out.printf("A string contém todas as palavras do set? %b\n", cj.contemTodas(s));
    }

}
