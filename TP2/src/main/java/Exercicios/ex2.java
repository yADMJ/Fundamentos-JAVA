package Exercicios;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\nA média das suas notas é: " + media);

        if (media >= 7) {
            System.out.println("Você foi bem.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Você passou mas por pouco, horrível");
        } else {
            System.out.println("Você foi de F, decepeção.");
        }
        scanner.close();
    }
}