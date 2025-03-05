package Exercicios;
import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxaDolar = 5.20;
        double taxaEuro = 5.80;
        double taxaLibra = 6.50;

        System.out.print("Digite o valor em reais: ");
        double valorReais = scanner.nextDouble();

        System.out.println("Escolha para que moeda irá converter: ");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        System.out.print("Digite o número da opção: ");


        int opcao = scanner.nextInt();
        double valorConvertido = 0;
        String moeda = "";
        switch (opcao) {
            case 1:
                valorConvertido = valorReais / taxaDolar;
                moeda = "Dólares";
                break;
            case 2:
                valorConvertido = valorReais / taxaEuro;
                moeda = "Euros";
                break;
            case 3:
                valorConvertido = valorReais / taxaLibra;
                moeda = "Libras";
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if (valorConvertido > 0) {
            System.out.printf("O valor de R$ %.2f convertido para %s é: %.2f\n", valorReais, moeda, valorConvertido);
        }
        scanner.close();
    }
}