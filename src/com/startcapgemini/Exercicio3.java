package com.startcapgemini;

/*
 Escreva um algoritmo para determinar o consumo médio
 de um automóvel sendo fornecida a distância
 total percorrida pelo automóvel e o total de combustível gasto
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int distanciaPercorrida;
        int combustivelGasto;
        int mediaConsumo;

        System.out.println("Qual foi a média de consumo do seu automóvel? ");
        System.out.println("Digite KM percorrido: ");
        distanciaPercorrida = leitor.nextInt();
        System.out.println("Digite quanto Litros de combustivel foi gasto: ");
        combustivelGasto = leitor.nextInt();

        mediaConsumo = distanciaPercorrida / combustivelGasto;

        System.out.println("A média de consumo foi: " + mediaConsumo + " km/L");

    }
}
