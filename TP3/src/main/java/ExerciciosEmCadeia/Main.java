package ExerciciosEmCadeia;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("RTX 10080", 20000000, 8);

        produto.exibirInformacoes();

        produto.alterarPreco(1000000000);
        produto.alterarQuantidade(1);

        produto.exibirInformacoes();
    }
}
