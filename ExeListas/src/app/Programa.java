package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos funcionários serão registrados? ");
        int N = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite o id do funcionário: " + (i + 1));
            Integer id = sc.nextInt();

            System.out.println("Digite o nome do funcionário: " + (i + 1));
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Digite o salário do funcionário: " + (i + 1));
            Float salario = sc.nextFloat();

            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println("Insira o id do funcionário que irá receber aumento: ");
        int id = sc.nextInt();

        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (func == null) {
            System.out.println("O id informado não existe");
        } else {
            System.out.println("Insira o aumento em porcentagem (Apenas números): ");
            float aumento = sc.nextFloat();
            func.aumentoSalario(aumento);
        }


        System.out.println("Lista de funcionários:");
        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }

        sc.close();
    }
}

