package com.startcapgemini;
import java.util.Scanner;
/*
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);
 */

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        float nota;
        float soma=0;
        float media;



        System.out.println("Informe o nome do aluno: ");
        nome = leitor.next();

        for(int i= 1;i<4;i++){
            System.out.println("insira a nota " + i);
            nota = leitor.nextFloat();
            soma = soma + nota;
        }
        media = soma/3;

        System.out.println("O Aluno "+ nome);
        System.out.println("Sua Média é: "+ media);

        if(media>= 7){
            System.out.println("Aprovado!!!");
        }if(media <=5){
            System.out.println("Reprovado. ");
        }else {
            System.out.println("Recuperação");
        }
    }
}
