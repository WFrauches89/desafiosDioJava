package com.esttudos.dio.desafio2.ContaPoupanca;


import com.esttudos.dio.desafio2.ContaBancaria2.ContaBancaria2;

public class ContaPoupanca extends ContaBancaria2 {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros+ "%");
    }
}