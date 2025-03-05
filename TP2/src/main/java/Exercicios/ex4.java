package Exercicios;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();


        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);
        System.out.println("Você tem " + idadeEmDias + " dias na conta(ta veio ein).");
        scanner.close();
    }
}
