package com.startcapgemini;
/*
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com o usuário;
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double dolar;
        double real;
        double valorCotacao;

        System.out.println("Valor em Dolar($): ");
            dolar = leitor.nextDouble();
        System.out.println("Valor da cotação do Dólar: ");
            valorCotacao = leitor.nextDouble();

            real = dolar * valorCotacao;
        System.out.println("Valor em Real (R$): " + real + "R$" );


    }
}
