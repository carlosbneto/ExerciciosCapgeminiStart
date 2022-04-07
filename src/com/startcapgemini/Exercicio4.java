package com.startcapgemini;

import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;*/

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float salario;
        float vendasDinheiro;
        float valorComissao;
        float comissao;

        //15% de comissão
        valorComissao = (15/100f);

        System.out.println("Informe o nome do vendedor: ");
            nome = leitor.next();
        System.out.println("Informe o salario: ");
            salario = leitor.nextFloat();
        System.out.println("Quanto o vendendor vendeu (em dinheiro): ");
            vendasDinheiro = leitor.nextFloat();

            comissao = ((valorComissao) * vendasDinheiro);

        System.out.println("Valor da Comissão: " + comissao);
        System.out.println("Salário Fixo: " + salario);
        System.out.println("Salário + Comissão: " + (salario+comissao));


    }
}
