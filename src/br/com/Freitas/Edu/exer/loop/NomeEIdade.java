package br.com.Freitas.Edu.exer.loop;
      /*  Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o
        nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome)*/

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        while(true){

            System.out.println("Qual seu nome ?");
            String nome = scanner.next();
            if (nome.equals("0"))
                break;
            System.out.println("Qual sua idade?");
            int idade = scanner.nextInt();

        }



    }
}
