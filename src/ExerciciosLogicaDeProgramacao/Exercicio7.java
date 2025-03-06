package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primero valor inteiro: ");
        boolean X = sc.nextBoolean();
        System.out.print("Digite o segundo valor inteiro: ");
        boolean Y = sc.nextBoolean();

        if(X == true && Y == true){
            System.out.println("Os valores são verdadeiros!");
        } else if (X == true && Y == false) {
            System.out.println("Um valor é verdadeiro e outro falso!");
        }  else if (X == false && Y == true) {
            System.out.println("Um valor é verdadeiro e outro falso!");
        } else {
            System.out.println("Os dois valores são falsos!");
        }
    }
}
