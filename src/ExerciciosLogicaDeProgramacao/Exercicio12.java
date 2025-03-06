package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.println(" 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto R$" + (valorProduto - (valorProduto * 0.15)));
        System.out.println(" 2 - À Vista no cartão de crédito, recebe 10% de desconto R$" + (valorProduto - (valorProduto * 0.10)));
        System.out.println(" 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros R$" + valorProduto);
        System.out.println(" 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% R$" + String.format("%.2f", valorProduto * 1.10));
    }
}
