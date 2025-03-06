package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor a ser reajustado: ");
        double valor = sc.nextFloat();

        System.out.println("O valor reajustado é " + String.format("%.2f", valor * 1.05));
    }
}
