package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Empregado> list = new ArrayList<>();

        System.out.print("Quantos colaboradores deseja registrar?");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Empregado #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double Salario = sc.nextDouble();

            Empregado emp = new Empregado(id, nome, Salario);
            list.add(emp);
        }

        sc.close();
    }

}
