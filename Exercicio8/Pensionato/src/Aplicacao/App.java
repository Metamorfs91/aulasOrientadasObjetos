package Aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Rent;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent#" + i + ":");
            System.out.print("Nome:");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Quarto:");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(nome, email);

        }

        System.out.println();
        System.out.println("Quartos Alugados:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }

        }

        sc.close();
    }
}
