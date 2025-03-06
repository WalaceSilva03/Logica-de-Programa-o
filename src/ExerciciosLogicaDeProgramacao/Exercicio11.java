package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double A = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double B = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double C = sc.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double D = sc.nextDouble();

        double somaNotas = A + B + C + D;
        double media = somaNotas/4;
        System.out.println("A média do aluno foi: " + media);
        if(media >= 7){
            System.out.println("Aluno aprovado.");
        } else{
            System.out.println("Aluno reprovado");
        }
    }
}
