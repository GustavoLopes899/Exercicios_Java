package aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteArrayListString {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> lista1 = new ArrayList();
        ArrayList<String> lista2 = new ArrayList();
        final int tam = 3;
        for (int i = 0; i < tam; i++) {
            System.out.printf("Entre com uma string [%d de %d]: ", i+1, tam);
            String string = input.nextLine();
            lista1.add(string);
        }
        for (String s : lista1) {
            if(s.length() < 3) {
                lista2.add(s);
            }
        }
        lista1.removeAll(lista2);
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
    }

}
