package app;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = entrada.nextInt();
        float media = (n1+n2)/2f;
        System.out.print("A média dos números é: " + media);

    }
}
