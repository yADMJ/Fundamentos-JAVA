package ExerciciosEmCadeia;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.titular = "Bagribs";
        minhaConta.numero = 22;
        minhaConta.agencia = "Agência 00008";
        minhaConta.saldo = 0.05;
        minhaConta.dataAbertura = "22/02/2022";

        minhaConta.saca(0.02);
        minhaConta.deposita(1000000);

        double rendimento = minhaConta.calculaRendimento();
        System.out.println("Rendimento do pobre: R$" + rendimento);
    }
}

