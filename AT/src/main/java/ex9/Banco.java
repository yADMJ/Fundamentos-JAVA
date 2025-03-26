package ex9;


class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");
        }
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo Atual: R$ %.2f\n", titular, saldo);
    }
}


public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("John Bloodborne", 1000.00);

        conta.exibirSaldo();

        conta.depositar(1000.00);
        conta.sacar(40000.00);
        conta.sacar(1000.00);

        conta.exibirSaldo();
    }
}
