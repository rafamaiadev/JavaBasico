package app;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para escolher a marca: ");
        int nome = entrada.nextInt();
        String marca;
        switch (nome) {
            case 1:
                marca = "Chevrolet";
                break;
            case 2:
                marca = "hyundai";
                break;
            case 3:
                marca = "Volkswagen";
                break;
            case 4:
                marca = "Bmw";
                break;
            default:
                marca = "Não encontrado";
        }
        System.out.println("A marca é: " + marca);
    }
}
