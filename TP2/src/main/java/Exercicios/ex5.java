package Exercicios;
import java.util.Scanner;


public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor da compra: R$ ");

        double valorCompra = scanner.nextDouble();
        double desconto = 0;
        double valorFinal;


        if (valorCompra > 1000) {
            desconto = valorCompra * 0.10;
        } else if (valorCompra >= 500) {
            desconto = valorCompra * 0.05;
        } else {
            desconto = 0;
        }


        valorFinal = valorCompra - desconto;

        System.out.printf("\nValor original: R$ %.2f\n", valorCompra);
        System.out.printf("Desconto de pobre aplicado: R$ %.2f\n", desconto);
        System.out.printf("Fica esse preço pobre: R$ %.2f\n", valorFinal);
        scanner.close();
    }
}
