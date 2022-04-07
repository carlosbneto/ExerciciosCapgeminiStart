package com.startcapgemini;

import java.util.Scanner;

/*Faça um algoritmo que receba dois números e
exiba o resultado da sua soma;
 */

//inicio
public class Exercicio1 {
////
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float numero1;
        float numero2;
        float resultado;

        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextFloat();

        resultado = numero1 + numero2;
        System.out.println("A soma dos números é: " + resultado);

    }
}
