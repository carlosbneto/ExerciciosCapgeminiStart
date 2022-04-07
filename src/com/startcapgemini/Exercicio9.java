package com.startcapgemini;
/*
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float deposito;
        float juroFixo;
        float depositoComJuros;

        System.out.println("Digite o seu depósito: ");
        deposito = leitor.nextFloat();

        //porcentagem 0,07%
        juroFixo = (0.07f/100f)*deposito;
        depositoComJuros = juroFixo + deposito;

        System.out.println("O seu depósito após um mês: " + depositoComJuros);

    }
}
