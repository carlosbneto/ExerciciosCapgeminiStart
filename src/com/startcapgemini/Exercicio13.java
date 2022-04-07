package com.startcapgemini;

import java.util.Scanner;

/*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Insira um número: ");
        numero = leitor.nextInt();

        if (numero > 10){
            System.out.println("Esse número é maior que 10");

        }


    }

}
