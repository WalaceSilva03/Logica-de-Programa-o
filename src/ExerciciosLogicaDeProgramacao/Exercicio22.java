package ExerciciosLogicaDeProgramacao;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite primeiro valor: ");
        double A = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double B = sc.nextDouble();

        System.out.println("Quociente: " + String.format("%.2f", A/B));
        System.out.println("Resto: " + String.format("%.2f", A%B));
    }
}
