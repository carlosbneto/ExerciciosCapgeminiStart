package com.startcapgemini;
import java.util.Scanner;
/*
Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor1;

        System.out.println("Digite um valor: ");
        valor1 = leitor.nextInt();

        if(valor1 >= 100 && valor1 <= 200){
            System.out.println("Esse valor está entre 100 e 200");

        } else {
            System.out.println("Esse valor não está entre 100 e 200");
        }

    }
}
