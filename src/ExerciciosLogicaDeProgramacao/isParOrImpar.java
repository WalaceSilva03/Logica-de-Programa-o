package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class isParOrImpar {
    public static void main(String[] args) {
        System.out.print("Digite o número para verficarmos se é impar ou par: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0 && x>0){
            System.out.println("O número é par e positivo");
        } else if (x % 2 == 0 && x<0) {
            System.out.println("O número é par e negativo");
        } else if (x % 2 != 0 && x>0){
            System.out.println("O número é impar e positivo");
        } else {
            System.out.println("O número é impar e negativo");
        }
    }
}
