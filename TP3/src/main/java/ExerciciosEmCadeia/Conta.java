package ExerciciosEmCadeia;

public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque do pobre" + valor + " realizado. Pobrize: R$" + saldo);
        } else {
            System.out.println("Ta Pobre, pede menos.");
        }
    }

    public void deposita(double valor) {
        saldo += valor;
        System.out.println("Depósito do pobre" + valor + " realizado. Agora tem: R$" + saldo);
    }

    public double calculaRendimento() {
        return saldo * 0.1;
    }
}

