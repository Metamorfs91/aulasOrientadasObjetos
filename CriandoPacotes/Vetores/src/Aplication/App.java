package Aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextInt();
            String nome = sc.nextLine();
            double valor = sc.nextDouble();
            vect[i] = new Produto(nome, valor);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getValor();
        }
        double avg = sum / n;

        System.out.printf("VALOR MEDIO = %.2f%n", avg);
        sc.close();
    }
}
