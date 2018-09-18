package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TesteArrayListString2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList();
        final int tam = 3;
        for (int i = 0; i < tam; i++) {
            System.out.printf("Entre com uma string [%d de %d]: ", i + 1, tam);
            String string = input.nextLine();
            array.add(string);
        }
        System.out.println("Não ordenado:");
        for (String s : array) {
            System.out.println(s);
        }
        Collections.sort(array);
        System.out.println("Ordenado:");
        for (String s : array) {
            System.out.println(s);
        }
    }

}
