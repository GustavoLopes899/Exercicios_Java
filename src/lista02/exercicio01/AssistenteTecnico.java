package lista02.exercicio01;

public class AssistenteTecnico extends Assistente {

    private double bonusSalarial;

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        if (bonusSalarial <= 0) {
            throw new IllegalArgumentException("Valor incorreto.");
        }
        this.bonusSalarial = bonusSalarial;
        this.setSalario(this.getSalario() + bonusSalarial);
    }

}
