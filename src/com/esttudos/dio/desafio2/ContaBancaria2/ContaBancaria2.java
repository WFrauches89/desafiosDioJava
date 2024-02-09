package com.esttudos.dio.desafio2.ContaBancaria2;

import java.text.DecimalFormat;

public class ContaBancaria2 {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria2(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}