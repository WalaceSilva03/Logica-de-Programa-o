package ExerciciosLogicaDeProgramacao;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        System.out.print("Digite o lado do triangulo: ");
        double A = sc.nextDouble();
        System.out.print("Digite o lado do triangulo: ");
        double B = sc.nextDouble();
        System.out.print("Digite a base do triangulo: ");
        double C = sc.nextDouble();

        if(A == B && A != C && B != C){
            System.out.println("O triangulo é isóceles");
        } else if (A == B && A == C && B == C){
            System.out.println("O trinângulo é equilátero");
        } else {
            System.out.println("O triângulo é escaleno");
        }

    }
}
