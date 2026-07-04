import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Nome: " );
//        String nome = scanner.nextLine();
//        System.out.println("RG: " );
//        String rg = scanner.nextLine();
//        System.out.println("CPF:");
//        String cpf = scanner.nextLine();
//        System.out.println("Telefone:");
//        String telefone = scanner.nextLine();
//        System.out.println("Endereço:");
//        String endereco = scanner.nextLine();
//        System.out.println("E-mail:");
//        String email = scanner.nextLine();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if(n1 > n2){
            System.out.println("O primeiro número é maior que o segundo.");
        } else if(n1 < n2) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }

}