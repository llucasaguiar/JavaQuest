package aula03.heranca;

public class Aviao extends Veiculo{

    private int motores;
    private int altitude;
    private String companhia;

    public void decolar() {
        System.out.println("Avião decolando;");
    }

    public void pousar() {
        System.out.println("Avião pousando.");
    }

    public void abrirTremPouso() {
        System.out.println("Abrindo trem de pouso.");
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "motores=" + motores +
                ", altitude=" + altitude +
                ", companhia='" + companhia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
