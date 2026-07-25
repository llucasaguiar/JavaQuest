package aula03.exemplo3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();

        System.out.println("Quantos carros quer cadastrar?");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            Carro c = new Carro();
            c.setId(i + 1);
            System.out.println("Marca");
            c.setMarca(sc.next());
            System.out.println("Modelo");
            c.setModelo(sc.next());
            System.out.println("Cor");
            c.setCor(sc.next());
            System.out.println("Placa");
            c.setPlaca(sc.next());
            carros.add(c);
        }

        // Listar usando FOR-EACH
        for (Carro c : carros) {
            System.out.println("Id: " + c.getId());
            System.out.println("Marca: " + c.getMarca());
            System.out.println("Modelo: " + c.getModelo());
            System.out.println("Cor: " + c.getCor());
            System.out.println("Placa: " + c.getPlaca());
        }


    }
}
