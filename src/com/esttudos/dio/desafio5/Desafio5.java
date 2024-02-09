package com.esttudos.dio.desafio5;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira os detalhes da transação (data, hora, descrição, valor), separados por vírgula:");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        // TODO: Solicitar ao usuário que forneça os valores necessários para criar uma Transacao.
        if (partes.length != 4) {
            System.out.println("Entrada inválida. Certifique-se de fornecer os detalhes corretos da transação.");
            return;
        }

        String data = partes[0].trim();
        String hora = partes[1].trim();
        String descricao = partes[2].trim();
        double valor =Double.parseDouble(partes[3].trim());


        Transacao transacao = new Transacao(data,hora,descricao,valor );

        transacao.imprimir();
    }
}
