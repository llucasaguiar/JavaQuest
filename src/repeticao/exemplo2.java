package repeticao;

import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String rasp;

        System.out.println("Saldo: ");
        double saldo = scanner.nextInt();
        do {
            System.out.println("Digite 1 para consultar saldo; 2 para depositar; 3 para sacar; 0 para encerrar.");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Opção 1 - Consultar saldo.");
                    System.out.println("R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Opção 2 - Depositar.");
                    System.out.println("Digite o valor para depósito.");
                    double deposito = scanner.nextDouble();
                    double novoSaldo = saldo + deposito;
                    System.out.println("Saldo: R$ " + novoSaldo);
                    break;

                case 3:
                    System.out.println("Opção 3 - Sacar.");
                    System.out.println("Digite o valor para sacar.");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        double novoSaldo1 = saldo - saque;
                        System.out.println("Saldo: R$ " + novoSaldo1);
                    }
                    break;

                case 0:
                    System.out.println("Opção 0 - Encerrar.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("Digite S para repetir.");
            rasp = scanner.next();
        } while (rasp.equalsIgnoreCase("S"));
        scanner.close();
    }
}
