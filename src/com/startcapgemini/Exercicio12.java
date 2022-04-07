package com.startcapgemini;
/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;
 */

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float custoFabrica;
        float percentualDistribuidor;
        float impostos;
        float custoImpostos;
        float carroNovo;

        System.out.println("Insira o Custo de Fábrica:");
        custoFabrica = leitor.nextFloat();

        // 45%          900
        impostos = (45f/100)*custoFabrica;
                        //2900
        custoImpostos= (custoFabrica + impostos);
                                    //0.28       812
        percentualDistribuidor = (28f/100)*custoImpostos;

        carroNovo = custoImpostos + percentualDistribuidor;


        System.out.println("O carro novo vai custa: " + carroNovo + "R$");





    }
}
