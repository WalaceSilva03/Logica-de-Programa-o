package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor Hora Aula: ");
        double valorHoraAula = sc.nextDouble();
        System.out.print("Número de aulas no mês: ");
        double numeroAulas = sc.nextDouble();
        System.out.print("Desconto INSS: ");
        double descontoINSS = sc.nextDouble();

        double salario = (valorHoraAula * numeroAulas) * (1 - (descontoINSS/100));
        System.out.println("Salário: " + String.format("%.2f", salario));
    }
}
