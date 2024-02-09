package com.esttudos.dio.desafio3;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

//"digital" ou "físico"

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha = scanner.nextInt();
            scanner.nextLine();
            int confirmaSenha = scanner.nextInt();


            CofreDigital cofreDigital = new CofreDigital(senha);

            cofreDigital.validarSenha(confirmaSenha);

            cofreDigital.imprimirInformacoes();

        } else if (tipoCofre.equalsIgnoreCase("fisico")||tipoCofre.equalsIgnoreCase("físico")){
            CofreFisico cofreFisico = new CofreFisico();

            cofreFisico.imprimirInformacoes();

        }


    }
}