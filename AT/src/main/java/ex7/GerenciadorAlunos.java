package ex7;
import java.util.Scanner;


class Aluno {
    private String nome;
    private String matricula;
    private double nota1, nota2, nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        System.out.println("\nAluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Status: Vai pro proximo ano");
        } else {
            System.out.println("Status: Fica retido ai cabaço.");
        }
    }
}


public class GerenciadorAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        aluno.verificarAprovacao();

        scanner.close();
    }
}
