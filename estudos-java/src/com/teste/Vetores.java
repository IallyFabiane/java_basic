package com.teste;


import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);

        System.out.println("Insira tamanho do vetor");
        int tamanho = inserir.nextInt();
        int[] vetorA =  new int[tamanho];
        int[] vetorB =  new int[tamanho];
        int[] vetorC = new int[tamanho];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira o elemento do vetor A da posição: " + i);
            vetorA[i] = inserir.nextInt();
        }

        System.out.println("--------------------------------");

        for ( int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Elementos do vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("Elementos do vetor B: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");

        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("--------------------------------");

        System.out.println("Elementos do vetor C: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorC[i] + " ");
        }


    }
}
