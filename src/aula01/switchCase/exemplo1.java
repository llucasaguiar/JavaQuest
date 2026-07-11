package aula01.switchCase;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para soma; 2 para subtração; 3 para divisão; 4 para multiplicação.");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println("Opçãoi 1 escolhida, soma.");
                break;

            case 2:
                System.out.println("Opção 2 escolhida, subtração.");
                break;

            case 3:
                System.out.println("Opção 3 escolhida, divisão.");
                break;

            case 4:
                System.out.println("Opção 4 escolhida, multiplicação.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
