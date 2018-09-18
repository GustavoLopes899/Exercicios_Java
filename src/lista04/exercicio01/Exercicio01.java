package lista04.exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Início do main.");
        metodo1();
        System.out.println("Fim do main.");
    }
    
    static void metodo1() {
        System.out.println("Inicializando método 1.");
        try {
            metodo2();
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.printf("Índice [%s] fora  dos limites.\n", ex.getMessage());
        }
        System.out.println("Fim do método 1.");
    }

    static void metodo2() {
        System.out.println("Inicializando método 2.");
        int array[] = new int[10];
        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("Fim do método 2.");
    }
}
