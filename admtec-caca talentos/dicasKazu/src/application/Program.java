package application;

import entities.Soma;

import java.util.Locale;
import java.util.Scanner;

import static entities.Soma.soma;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite valor de x: ");
        int x = scan.nextInt();
        System.out.println("Digite o valor y: ");
        int y = scan.nextInt();

        int soma = soma(x,y);
        System.out.println(soma);

    }
}
