package br.com.Freitas.Edu.exer.loop;

/* Faça um programa que leia 5 números e informe o maior número e a média desses números. */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        float media;



        


        do {

            System.out.println("Numero");
            numero = scanner.nextInt();

            soma = soma + numero;
            if (numero > maior) maior  = numero;
            media = soma / 5f ;

            count = count + 1;




        }   while (count < 5);

        System.out.println("o numero maior é: " + maior);
        System.out.println("soma é " + soma);
        System.out.println("media é " + media);






    }
}
