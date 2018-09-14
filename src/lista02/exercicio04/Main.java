package lista02.exercicio04;

public class Main {
    
    public static void main(String args[]) {
        Imovel im1 = new Novo(5000, 250);
        im1.imprimePreco();
        
        Imovel im2 = new Velho(5000, 120);
        im2.imprimePreco();
        
    }

}
