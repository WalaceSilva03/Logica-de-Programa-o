package ExerciciosLogicaDeProgramacao;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        System.out.print("Digite a temperatura em fahrenheit: ");
        double tempFarenheit = sc.nextDouble();
        double conversorFarenheitToCelsius = (5*(tempFarenheit-32)/9);
        System.out.println("Temperatura em farenheit: " + tempFarenheit);
        System.out.println("Temperatura em celsius: " + conversorFarenheitToCelsius);
    }
}
