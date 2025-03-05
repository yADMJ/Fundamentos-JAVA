package Exercicios;
import java.util.Scanner;


public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");

        String senhaCorreta = scanner.nextLine();

        String senhaDigitada;
        do {
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = scanner.nextLine();
            if
            (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tenta de novo burro.");
            }
        } while
        (!senhaDigitada.equals(senhaCorreta));


        System.out.println("Senha correta! Entre corno.");
        scanner.close();
    }
}
