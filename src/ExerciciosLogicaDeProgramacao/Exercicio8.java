package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primero valor inteiro: ");
        int A = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int B = sc.nextInt();
        System.out.print("Digite o terceiro valor inteiro: ");
        int C = sc.nextInt();
        System.out.println("O programa será executado em ordem decrescente");
        System.out.println();

        if(A > B && B > C){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        } else if(B > A && A > C){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        } else if(C > B && B > A){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        } else if(A > B && C > B){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        } else {
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        }
    }
}
