package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados?");
        int N = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[N];

        double somaAltura = 0, menorDe16 = 0, media;
        for (int i = 0; i < pessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Digite os dados da pessoa %d\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            somaAltura += altura;
            pessoas[i] = new Pessoa(nome, idade, altura);
            if (pessoas[i].getIdade() < 16) {
                menorDe16++;
            }
        }
        media = (menorDe16 / pessoas.length) * 100;
        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da pessoa %d\n", i + 1);
            System.out.println(pessoas[i].getNome());
            System.out.println(pessoas[i].getIdade());
            System.out.println(pessoas[i].getAltura());
            System.out.println("\n");
        }
        System.out.printf("Altura média: %.2f\n", somaAltura / pessoas.length);
        System.out.printf("Menores de 16 anos: %.2f%%", media);

        sc.close();
    }
}

