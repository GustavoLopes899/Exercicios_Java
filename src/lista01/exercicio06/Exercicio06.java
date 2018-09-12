package lista01.exercicio06;

import lista01.exercicio05.ConversaoDeUnidadesDeVolume;

public class Exercicio06 {
    
    public static void main(String[] args) {
        double volume = 1890;       // em metros cúbicos
        System.out.printf("Volume de água de um piscina olímpica: %.2f\n", volume);
        System.out.printf("Conversão:\n");
        ConversaoDeUnidadesDeVolume.m3ParaLitros(volume);
        ConversaoDeUnidadesDeVolume.m3ParaCm3(volume);
        ConversaoDeUnidadesDeVolume.m3ParaPes3(volume);
        
        
    }

}
