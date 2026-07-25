package aula03.heranca;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected String cor;
    protected int velocidade;

    public void ligar() {
        System.out.println("Veículo ligado;");
    }

    public void desligar() {
        System.out.println("Veículo desligado;");
    }

    public void acelerar() {
        System.out.println("Veículo acelerando em km/h;");
    }

    public void frear() {
        System.out.println("Veículo freando;");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
