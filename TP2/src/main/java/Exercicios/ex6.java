package Exercicios;
import java.util.Scanner;


public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um ano: ");

        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) ||
                (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto (benett tem aniversário).");
        } else {
            System.out.println(ano + " não é um ano bissexto (benett não tem aniversário).");
        }
        scanner.close();
    }
}
