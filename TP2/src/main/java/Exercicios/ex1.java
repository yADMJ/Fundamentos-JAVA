package Exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine();
        System.out.print("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine();


        System.out.println("\nCadastro Completo:");
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);


        int tamanhoNomeCompleto = nomeCompleto.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();


        if (tamanhoNomeCompleto > tamanhoNomeMae && tamanhoNomeCompleto > tamanhoNomePai) {
            System.out.println("\nSeu nome é o mais longo.");
        }
        else if (tamanhoNomeMae > tamanhoNomeCompleto && tamanhoNomeMae > tamanhoNomePai) {
            System.out.println("\nO nome da sua mãe é o mais longo.");

        }
        else if (tamanhoNomePai > tamanhoNomeCompleto && tamanhoNomePai > tamanhoNomeMae) {
            System.out.println("\nO nome do seu pai é o mais longo.");
        }
        else {
            System.out.println("\nExistem nomes com o mesmo comprimento.");
        }
        scanner.close();
    }
}
