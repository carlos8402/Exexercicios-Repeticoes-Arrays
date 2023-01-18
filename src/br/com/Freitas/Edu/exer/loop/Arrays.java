package br.com.Freitas.Edu.exer.loop;

  /*Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
         Ao final, mostre os números e seus sucessores. */

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Números aleatorios ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");

        }
        System.out.println("\nSucessores dos Números aleatorios ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + " ");


        }
    }
}

