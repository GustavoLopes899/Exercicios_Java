package aula02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        int vowel = 0;
        int digit = 0;
        boolean begins, end;
        System.out.print("Enter a string: ");
        text = input.nextLine();
        System.out.println("a) String's length: " + text.length());
        System.out.println("b) Uppercase: " + text.toUpperCase());
        for (int j = 0; j < text.length(); j++) {
            if (text.toLowerCase().charAt(j) == 'a'
                    || text.toLowerCase().charAt(j) == 'e'
                    || text.toLowerCase().charAt(j) == 'i'
                    || text.toLowerCase().charAt(j) == 'o'
                    || text.toLowerCase().charAt(j) == 'u') {
                vowel++;
            }
            if (text.toLowerCase().charAt(j) == '0'
                    || text.toLowerCase().charAt(j) == '1'
                    || text.toLowerCase().charAt(j) == '2'
                    || text.toLowerCase().charAt(j) == '3'
                    || text.toLowerCase().charAt(j) == '4'
                    || text.toLowerCase().charAt(j) == '5'
                    || text.toLowerCase().charAt(j) == '6'
                    || text.toLowerCase().charAt(j) == '7'
                    || text.toLowerCase().charAt(j) == '8'
                    || text.toLowerCase().charAt(j) == '9') {
                digit++;
            }
            
        }
        System.out.println("c) Vowels: " + vowel);
        begins = text.startsWith("uni");
        System.out.println("d) String begins with 'UNI'? " + begins);
        end = text.endsWith("rio");
        System.out.println("e) String ends with 'RIO'? " + end);
        System.out.println("f) Digits(0..9): " + digit);
        String inverse = "";
        for (int i = text.length()-1; i >= 0; i--) {
            inverse += text.charAt(i);
        }
        boolean palindrome = text.equalsIgnoreCase(inverse);
        System.out.println("g) Palindrome? " + palindrome);
    }
}
