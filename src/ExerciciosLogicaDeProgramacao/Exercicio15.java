package ExerciciosLogicaDeProgramacao;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        System.out.print("Digite o ano que você nasceu: ");
        int ano = sc.nextInt();
        System.out.print("Digite o mês que você nasceu: ");
        int mes = sc.nextInt();
        System.out.print("Digite o dia que você nasceu: ");
        int dia = sc.nextInt();

        System.out.println("Você está vivo fazem " + (date.get(Calendar.YEAR) - ano) + " anos " + (mes - (date.get(Calendar.MONTH) + 1)) + " meses e " + (dia - date.get(Calendar.DAY_OF_MONTH)) + " dias.");

    }
}
