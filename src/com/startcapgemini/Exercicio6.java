package com.startcapgemini;

import java.util.Scanner;

/*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável, A passe a
possuir o valor da variável B e a variável B passe a possuir o valor da variável A.
Apresentar os valores trocados;
 */
public class Exercicio6 {
    public static void main(String[] args) {
        int a;
        int b;
        int c=0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor da Variavel A: ");
            a = leitor.nextInt();
        System.out.println("Informe o valor da Variavel B: ");
            b = leitor.nextInt();

            c = c + b;
            b = 0 + a;
            a = c + 0;

        System.out.println("Valor de A: " + a + " e Valor de B: " + b);


    }
}
