package aula12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f = null;
        FileReader fr;
        BufferedReader br;
        int numero;
        String tabuada;
        try {
            System.out.printf("Entre com um número inteiro: ");
            numero = input.nextInt();
            String filename = String.format("Tabuada_%d.txt", numero);
            f = new File(filename);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((tabuada = br.readLine()) != null) {
                System.out.println(tabuada);
            }
        } catch(IOException ex) {
            System.out.println("Arquivo não encontrado!");
        }
        
    }

}
