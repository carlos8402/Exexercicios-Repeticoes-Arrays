package br.com.Freitas.Edu.exer.loop;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPar = 0, quantImpar = 0;

        System.out.println("Qual a quantidade de números?");
        quantNumeros = scanner.nextInt();

        int  count = 0;

        do {
            count++;
            System.out.println("Numero:");
            numero = scanner.nextInt();

            if (numero % 2 == 0){quantPar++;
            } else
                quantImpar++;

        } while (count < quantNumeros);

        System.out.println("Números pares = " + quantPar);
        System.out.println("Números impares  = " + quantImpar);


    }
}
