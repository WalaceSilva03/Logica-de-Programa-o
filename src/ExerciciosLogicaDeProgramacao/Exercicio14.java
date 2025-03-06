package ExerciciosLogicaDeProgramacao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int B = sc.nextInt();

        System.out.println("Primeiro valor: " + A);
        System.out.println("Segundo valor: " + B);

        System.out.println("Alteração da ordem");

        int C = A;
        A = B;
        B = C;
        System.out.println("Primeiro valor: " + A);
        System.out.println("Segundo valor: " + B);
    }
}
