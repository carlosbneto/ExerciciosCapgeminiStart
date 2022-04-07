package com.startcapgemini;
import java.util.Scanner;

/*
Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            int valor1;
            int valor2;
            int maior;

        System.out.println("Digite o primeiro valor: ");
        valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = leitor.nextInt();


        if (valor2 > valor1){
            System.out.println("Maior Número: " + valor2);
        }else{
            System.out.println("Maior Número: " + valor1);
        }

    }
}
