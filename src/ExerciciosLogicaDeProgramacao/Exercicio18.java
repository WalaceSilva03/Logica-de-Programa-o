package ExerciciosLogicaDeProgramacao;

public class Exercicio18 {
    public static void main(String[] args) {
        double francisco = 1.50;
        double Sara = 1.10;
        int anos = 0;

        do {
            francisco += francisco + 0.02;
            Sara += Sara + 0.03;
            anos++;
        } while(Sara > francisco);

        System.out.println("Demorará " + anos + " para Sara passar de Francisco");
    }
}
