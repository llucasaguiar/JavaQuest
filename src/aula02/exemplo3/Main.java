package aula02.exemplo3;

public class Main {
    public static void main(String[] args) {

        Carro c = new Carro("Fiat", "Uno", "Cinza", "ABC123");

        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Cor: " + c.getCor());
        System.out.println("Placa: " + c.getPlaca());

    }
}
