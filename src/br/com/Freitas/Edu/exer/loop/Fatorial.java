package br.com.Freitas.Edu.exer.loop;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o numero");
        int fatorial = scanner.nextInt();

        int multipicacao = 1;

        System.out.println(fatorial + "! = ");

        for ( int i = fatorial  ; i >= 1  ; i --) {

            multipicacao = multipicacao * i;



        }

        System.out.println(multipicacao);

    }
}
