import java.util.Locale;
import java.util.Scanner;
import entidade.Empregado;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empregado emp = new Empregado();

        System.out.print("Nome: ");
        emp.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + emp);
        System.out.println();
        System.out.println("Qual a porcentagem do aumento?");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Dados Atualizados: " + emp);
        sc.close();

    }
}
