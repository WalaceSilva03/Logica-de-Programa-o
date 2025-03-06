package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número que você quer a tabuada: ");
        int number = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " X " + i + " :" + number*i);
        }
    }
}
