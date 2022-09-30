import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um número inteiro x: ");
        int x = scan.nextInt();
        System.out.println("Escreva um número inteiro y: ");
        int y = scan.nextInt();
        int somados = soma(x, y);
        System.out.println(somados);

    }
    public static int soma (int x, int y){
        return x + y;
    }
}