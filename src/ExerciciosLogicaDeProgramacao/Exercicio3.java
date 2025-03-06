package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primero valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int B = sc.nextInt();
        int C;

        if(A == B){
            C = A + B;
            System.out.println("O resultado é " + C);
        } else {
            C = A * B;
            System.out.println("O resultado é " + C);
        }
    }
}
