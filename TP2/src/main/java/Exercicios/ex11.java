package Exercicios;
import java.util.Scanner;



public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.print("Sequência: ");

        for (int i = valorInicial; i <= 100; i += incremento) {
            if (i != valorInicial) {
                System.out.print(", ");
            }
            System.out.print(i);
        }


        System.out.println();
        scanner.close();
    }
}
