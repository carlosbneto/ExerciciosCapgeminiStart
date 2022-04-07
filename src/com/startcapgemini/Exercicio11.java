package com.startcapgemini;
/*
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoCusto;
        double valorVenda;
        double percentualVenda;
        double percentual;

        System.out.println("Insira o preço de Custo: ");
        precoCusto = leitor.nextDouble();

        System.out.println("Insira o percentual de acréscimo: (%) ");
        percentualVenda = leitor.nextDouble();


        //Percentual
        percentual = (percentualVenda/100) * precoCusto;


        valorVenda = percentual + precoCusto;

        System.out.println("O valor de venda é: " + valorVenda + "R$");


    }

}
