package aula03.heranca;

public class Bicicleta extends Veiculo{

    private int marchas;
    private String tipoFreio;
    private boolean possuiCesta;

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void tocarCampainha() {
        System.out.println("Tocando campanhia.");
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public boolean isPossuiCesta() {
        return possuiCesta;
    }

    public void setPossuiCesta(boolean possuiCesta) {
        this.possuiCesta = possuiCesta;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marchas=" + marchas +
                ", tipoFreio='" + tipoFreio + '\'' +
                ", possuiCesta=" + possuiCesta +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
