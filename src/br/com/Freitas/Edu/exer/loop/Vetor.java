package br.com.Freitas.Edu.exer.loop;

/* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */

public class Vetor {
    public static void main(String[] args) {

        System.out.println("Vetor: ");

        int count = 0;

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");

        }
    }

}
