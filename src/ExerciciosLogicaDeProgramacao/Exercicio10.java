package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double A = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double B = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double C = sc.nextDouble();

        System.out.println("A média do aluno foi: " + ((A+B+C)/3));
    }
}
