package app;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        float media;
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        media = (n1+n2)/2f;
        System.out.println("A média é: " + media);
        if(media >= 9) {
            System.out.println("Parabéns");
        } else {
            System.out.println("Estude mais");
        }

    }
}
