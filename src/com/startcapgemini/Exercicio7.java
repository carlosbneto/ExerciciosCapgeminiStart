package com.startcapgemini;

/*
Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius: ");
        celsius = leitor.nextDouble();

        fahrenheit = (9*celsius+160)/5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°");
    }
}
