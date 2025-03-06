package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o do seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite o valor da sua altura: ");
        double altura = sc.nextDouble();
        altura = Math.pow(altura, 2);
        double IMC = peso/altura;

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if(IMC > 18.6 && IMC < 24.9){
            System.out.println("Peso ideal (parabéns)");
        } else if(IMC > 25 && IMC < 29.9){
            System.out.println("Levemente acima do peso");
        } else if(IMC > 30 && IMC < 34.9){
            System.out.println("Obesidade grau I");
        } else if(IMC > 35 && IMC < 39.9){
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }
    }
}
