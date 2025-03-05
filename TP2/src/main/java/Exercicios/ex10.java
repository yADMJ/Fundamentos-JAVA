package Exercicios;
import java.util.Random;
import java.util.Scanner;


public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;


        while (palpite != numeroSecreto) {
            System.out.print("Digite um palpite entre 1 e 100: ");
            palpite = scanner.nextInt();
            tentativas++;
            if (palpite < numeroSecreto) {
                System.out.println("O número é maior anta.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor anta");
            } else {
                System.out.println("Acertou finalmente mula só demorou: " + tentativas + " tentativas.");
            }
        }
        scanner.close();
    }
}
