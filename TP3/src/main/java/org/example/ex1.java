package org.example;


class Carro {
    String modelo;
    int ano;

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    void atualizarAno(int novoAno) {
        ano = novoAno;
    }
}

public class ex1 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Corsa";
        meuCarro.ano = 2008;

        meuCarro.exibirInformacoes();

        meuCarro.atualizarAno(2025);


        meuCarro.exibirInformacoes();
    }
}
