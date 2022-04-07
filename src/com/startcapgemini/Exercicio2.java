package com.startcapgemini;
import java.util.Scanner;

/*Faça um algoritmo que receba dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos dois números lidos;
 */


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float numero1;
        float numero2;
        float resultadoSoma;
        float resultadoSubtração;
        float resultadoMultiplicação;
        float resultadoDivisão;

        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextFloat();

        resultadoSoma = numero1 + numero2;
        resultadoSubtração= numero1 - numero2;
        resultadoMultiplicação = numero1 * numero2;
        resultadoDivisão = numero1 / numero2;

        System.out.println("A soma dos números é: " + resultadoSoma);
        System.out.println("A Subtração dos números é: " + resultadoSubtração);
        System.out.println("A Multiplicação dos números é: " + resultadoMultiplicação);
        System.out.println("A Divisão dos números é: " + resultadoDivisão);
    }
}
