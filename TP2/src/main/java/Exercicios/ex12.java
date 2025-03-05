package Exercicios;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+");

        System.out.println("A frase contém " + palavras.length + " palavras.");

        scanner.close();
    }
}
