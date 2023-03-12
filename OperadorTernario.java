package app;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        int r = n1>n2 ? 1 : 0;
        System.out.println(r);
    }
}
