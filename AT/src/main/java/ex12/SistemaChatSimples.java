package ex12;
import java.util.Scanner;


public class SistemaChatSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        int mensagemIndex = 0;

        while (mensagemIndex < 10) {
            if (mensagemIndex % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
            } else {
                System.out.print(usuario2 + ", digite sua mensagem: ");
            }

            mensagens[mensagemIndex] = scanner.nextLine();
            mensagemIndex++;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(usuario1 + ": " + mensagens[i]);
            } else {
                System.out.println(usuario2 + ": " + mensagens[i]);
            }
        }

        System.out.println("\nConversaram muito ein?");
    }
}
