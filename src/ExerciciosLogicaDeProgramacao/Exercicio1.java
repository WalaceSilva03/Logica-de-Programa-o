package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int A = sc.nextInt();
        System.out.print("Digite o Segundo número: ");
        int B = sc.nextInt();
        System.out.print("Digite o Terceiro número: ");
        int C = sc.nextInt();

        int soma = A + B;

        if(soma > C){
            System.out.println("A soma dos dois primeiros números é " + soma + " e é maior que " + C);
        } else if (soma == C) {
            System.out.println("A soma dos dois primeiros números é " + soma + " e é igual a " + C);
        } else {
            System.out.println("A soma dos dois primeiros números é " + soma + " e é menor que " + C);
        }
    }
}
