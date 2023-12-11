package Aplicacao;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] matriz = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Posição: " + i + "," + j);
                    if (j > 0)
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    if (i > 0)
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    if (i < M - 1)
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                }
            }
        }
    }
}