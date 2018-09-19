package lista05.exercicio01;

import java.util.ArrayList;

public class Exercicio01 {
    
    public static void main(String[] args) {
        ArrayList<Circulo> array = new ArrayList();
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(1.22);
        Circulo c3 = new Circulo(0.69);
        Circulo c4 = new Circulo(13.6);
        Circulo c5 = new Circulo(2.5);
        array.add(c1);
        array.add(c2);
        array.add(c3);
        array.add(c4);
        array.add(c5);
        for(int i = 0; i < array.size(); i++) {
            System.out.printf("Área do círculo %d: %.2f\n", i+1, array.get(i).calcularArea());
        }
    }

}
