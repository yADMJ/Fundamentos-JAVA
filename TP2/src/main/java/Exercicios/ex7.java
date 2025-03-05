package Exercicios;
import java.util.Scanner;


public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu salário bruto anual: R$ ");

        double salarioBruto = scanner.nextDouble();
        double imposto = 0;
        if (salarioBruto <= 22847.76) {
            imposto = 0;
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto - 22847.76) *
                    0.075;
        } else if (salarioBruto <= 45012.60) {
            imposto = (salarioBruto - 33919.80) *
                    0.15 + (33919.80 - 22847.76) * 0.075;
        } else if (salarioBruto <= 55976.16) {
            imposto = (salarioBruto - 45012.60) *
                    0.225 + (45012.60 - 33919.80) * 0.15 + (33919.80
                    - 22847.76) * 0.075;
        } else {
            imposto = (salarioBruto - 55976.16) *
                    0.275 + (55976.16 - 45012.60) * 0.225 + (45012.60
                    - 33919.80) * 0.15 + (33919.80 - 22847.76) *
                    0.075;
        }


        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("\nSalário bruto anual: R$ %.2f\n", salarioBruto);
        System.out.printf("Imposto de Renda a pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário líquido após imposto: R$ %.2f\n", salarioLiquido);
        scanner.close();
    }
}
