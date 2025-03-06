package ExerciciosLogicaDeProgramacao;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Já completou maioridade");
        } else{
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Já completou maioridade");
        }
    }
}
