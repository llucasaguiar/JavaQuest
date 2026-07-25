package aula03.exemplo2;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto("livro", 50, 85.90);

        // com construtor

        System.out.println("Nome: " + p.getNome());
        System.out.println("Quantidade: " + p.getQuantidade());
        System.out.println("Preço unitário: " + p.getPrecoUnitario());
        p.calcularSubTotal();
        System.out.println("\nValor da compra: R$ %.2f%n " + p.getTotal());

    }
}

// void sem retorno (executa e resolve)