package com.esttudos.dio.desafio1;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta,nomeTitular,saldo);

        System.out.println("Informacoes:");
        System.out.println("Conta:"+contaBancaria.getNumero());
        System.out.println("Titular:"+contaBancaria.getTitular());
        System.out.println("Saldo: R$ "+contaBancaria.getSaldo());
    }
}

