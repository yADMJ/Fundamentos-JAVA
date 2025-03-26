package ex10;
import java.io.*;
import java.util.Scanner;


class Compra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return produto + ";" + quantidade + ";" + precoUnitario;
    }

    public void exibirCompra() {
        System.out.printf("Produto: %s | Quantidade: %d | Preço Unitário: R$ %.2f | Total: R$ %.2f\n",
                produto, quantidade, precoUnitario, quantidade * precoUnitario);
    }
}


public class RegistroCompras {
    private static final String ARQUIVO = "compras.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            System.out.println("Cadastro de Compras:");
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Compra %d\n", i);
                System.out.print("Produto: ");
                String produto = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());
                System.out.print("Preço Unitário: ");
                double precoUnitario = Double.parseDouble(scanner.nextLine());

                Compra compra = new Compra(produto, quantidade, precoUnitario);
                writer.write(compra.toString());
                writer.newLine();
            }
            System.out.println("Compras cadastradas e salvas no arquivo!\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        System.out.println("Lendo compras registradas...\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                Compra compra = new Compra(dados[0], Integer.parseInt(dados[1]), Double.parseDouble(dados[2]));
                compra.exibirCompra();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
