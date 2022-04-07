package com.startcapgemini;

/*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética);
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String aluno;
        int prova = 1;
        float nota;
        float soma = 0;
        float media;

        System.out.println("Digite o nome do aluno: ");
        aluno = leitor.next();

        for(int i=1;i<4;i++){
            System.out.println("Digite a nota da prova " + i + ":");
            nota = leitor.nextFloat();
            soma = soma + nota;
        }

        System.out.println("Aluno: " + aluno);
        System.out.println("Média Aritmética: " + soma/3);

    }
}
