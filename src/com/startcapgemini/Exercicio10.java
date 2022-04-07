package com.startcapgemini;
/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double produto;
        double valorParcelas;

        System.out.println("Digite o valor do Produto: ");
        produto = leitor.nextDouble();

        valorParcelas = produto / 5;

        for(int i = 1; i<6; i++){
            System.out.println("Valor da " + i +"° Parcela: " + valorParcelas);

        }



    }
}
