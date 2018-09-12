package lista02.exercicio01;

public class AssistenteAdministrativo extends Assistente {

    private enum turnosPossiveis {
        dia, noite;
    }
    private turnosPossiveis turno;
    private double adicionalNoturno;
    
    public AssistenteAdministrativo() {
        this.adicionalNoturno = 0;
    }

    public String getTurno() {
        if (null == this.turno) {
            return "indefinido";
        } else switch (this.turno) {
            case dia:
                return "dia";
            case noite:
                return "noite";
            default:
                return "indefinido";
        }
    }

    public void setTurno(String turno) {
        if (turno.equalsIgnoreCase("dia")) {
            this.turno = turnosPossiveis.dia;
        } else {
            if (turno.equalsIgnoreCase("noite")) {
                this.turno = turnosPossiveis.noite;
            }
        }
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        if (this.turno == turnosPossiveis.noite) {
            if (adicionalNoturno < 0) {
                System.out.println("Valor incorreto.");
            } else {
                this.adicionalNoturno = adicionalNoturno;
                this.setSalario(this.getSalario() + adicionalNoturno);
            }
        }
    }
    
    @Override
    public void informacoes() {
        super.informacoes();
        System.out.printf("Adicional noturno: ");
        if (this.turno == turnosPossiveis.noite) {
            System.out.printf("R$%.2f\n", this.adicionalNoturno);
        } else {
            System.out.println("Não possui");
        }
        System.out.printf("Turno: %s\n", this.getTurno());
    }

}
