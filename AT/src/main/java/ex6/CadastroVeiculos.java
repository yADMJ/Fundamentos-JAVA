package ex6;


class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println("---------------------------");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Viagem registrada! " + km + " km adicionados.");
        } else {
            System.out.println("A quilometragem deve ser positiva.");
        }
    }
}


public class CadastroVeiculos {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("SEN-7444", "Mclaren Senna", 1992, 500000);
        Veiculo carro2 = new Veiculo("ADS-2132", "Masda 787b", 2022, 1000);

        System.out.println("Detalhes dos veículos antes das viagens:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        carro1.registrarViagem(500);
        carro2.registrarViagem(200);

        System.out.println("\nDetalhes dos veículos após as viagens:");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
