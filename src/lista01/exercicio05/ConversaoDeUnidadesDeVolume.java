package lista01.exercicio05;

public class ConversaoDeUnidadesDeVolume {

    public static double litroParaCm3(double litros) {
        if (litros <= 0) {
            throw new IllegalArgumentException("Valor inválido.\n");
        }
        double cm3 = litros * 1000;
        System.out.printf("%.2f litro(s) = %.2f centímetros cúbicos.\n", litros, cm3);
        return cm3;
    }

    public static double m3ParaLitros(double m3) {
        if (m3 <= 0) {
            System.out.printf("Valor inválido.\n");
            return -1;
        }
        double litros = m3 * 1000;
        System.out.printf("%.2f m³ = %.2f litros.\n", m3, litros);
        return litros;
    }

    public static double m3ParaCm3(double m3) {
        if (m3 <= 0) {
            System.out.printf("Valor inválido.\n");
            return -1;
        }
        double cm3 = ConversaoDeUnidadesDeVolume.m3ParaLitros(m3) * 1000;
        System.out.printf("%.2f m³ = %.2f centímetros cúbicos.\n", m3, cm3);
        return cm3;
    }

    public static double m3ParaPes3(double m3) {
        if (m3 <= 0) {
            System.out.printf("Valor inválido.\n");
            return -1;
        }
        double pes3 = m3 * 35.32;
        System.out.printf("%.2f m³ = %.2f pés cúbicos\n", m3, pes3);
        return pes3;
    }

    public static double galaoParaPolegadas3(double galao) {
        if (galao <= 0) {
            System.out.printf("Valor inválido.\n");
            return -1;
        }
        double pol3 = galao * 231;
        System.out.printf("%.2f galões = %.2f polegadas cúbicas\n", galao, pol3);
        return pol3;
    }

    public static double galaoParaLitros(double galao) {
        if (galao <= 0) {
            System.out.printf("Valor inválido.\n");
            return -1;
        }
        double litros = galao * 3785;
        System.out.printf("%.2f galões = %.2f litros\n", galao, litros);
        return litros;
    }

}
