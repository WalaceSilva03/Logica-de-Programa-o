package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double salarioMin = 1293.20, qtdSalarios;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salarioAtual = sc.nextFloat();
        qtdSalarios = salarioAtual/salarioMin;

        System.out.println("Você tem " + String.format("%.2f", qtdSalarios)  + " salários mínimos");
    }
}
