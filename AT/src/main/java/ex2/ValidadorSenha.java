package ex2;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        while (true) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            String erro = validarSenha(senha);
            if (erro == null) {
                System.out.println("Boa senha verme.");
                break;
            } else {
                System.out.println("Errou meu jovem: " + erro);
                System.out.println("Tente de novo.\n");
            }
        }

        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 8) {
            return "A senha deve ter no mínimo 8 caracteres.";
        }
        if (!Pattern.compile("[A-Z]").matcher(senha).find()) {
            return "A senha deve conter pelo menos uma letra maiúscula.";
        }
        if (!Pattern.compile("[0-9]").matcher(senha).find()) {
            return "A senha deve conter pelo menos um número.";
        }
        if (!Pattern.compile("[@#$%^&+=!]").matcher(senha).find()) {
            return "A senha deve conter pelo menos um caractere especial (@, #, $, etc.).";
        }
        return null;
    }
}