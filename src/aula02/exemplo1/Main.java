package aula02.exemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente c = new Cliente();

        // sem construtor

        System.out.println("Nome: " );
        c.setNome(scanner.nextLine());
        System.out.println("RG: " );
        c.setRg(scanner.nextLine());
        System.out.println("CPF:");
        c.setCpf(scanner.nextLine());
        System.out.println("Telefone:");
        c.setTelefone(scanner.nextLine());
        System.out.println("Endereço:");
        c.setEndereco(scanner.nextLine());
        System.out.println("E-mail:");
        c.setEmail(scanner.nextLine());

        System.out.printf("-----------------------");
        System.out.println("Nome: " + c.getNome());
        System.out.println("RG: " + c.getRg());
        System.out.println("CPF: " + c.getCpf());
        System.out.println("Telefone: " + c.getTelefone());
        System.out.println("Endereço: " + c.getEndereco());
        System.out.println("E-mail: " + c.getEmail());


        scanner.close();

    }
}
