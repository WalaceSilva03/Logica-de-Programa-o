package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que você deseja saber o anterior e sucessor: ");
        int Numero = sc.nextInt();

        System.out.println("Anterior: " + (Numero - 1));
        System.out.println("Atual: " + (Numero));
        System.out.println("Sucessor: " + (Numero + 1));
    }
}
