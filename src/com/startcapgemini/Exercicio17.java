package com.startcapgemini;
import java.util.Scanner;
/*
Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros;
        int numerosFinal=0;

        for(int i=1; i<=80; i++){
            System.out.println("Informe um número: ");
            numeros = leitor.nextInt();

            if(numeros>=10 && numeros<=150){
                numerosFinal++;
            }
        }
        System.out.println("Foram digitados 80 números e "+ numerosFinal + " estavam no intervalo de 10 e 150");
    }
}
