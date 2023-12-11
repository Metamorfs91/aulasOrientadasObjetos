import java.util.Locale;
import java.util.Scanner;

import estudante.Estudante;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante student = new Estudante();

        System.out.println("Digite o nome:");
        student.name = sc.nextLine();
        System.out.println("Digite nota1");
        student.nota1 = sc.nextDouble();
        System.out.println("Digite nota2");
        student.nota2 = sc.nextDouble();
        System.out.println("DIgite nota3");
        student.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("Reprovado!");
            System.out.printf("Faltam %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("Aprovado!");
        }
        sc.close();
    }
}
