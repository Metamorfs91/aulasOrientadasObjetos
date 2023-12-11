import java.util.Locale;
import java.util.Scanner;
import Entidade.Calculo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculo calc = new Calculo();
        System.out.println("Digite o Capital inicial:");
        this.ValorInicial = sc.nextDouble();
        System.out.println("Digite a Taxa De Juros");
        this.TxJuros = sc.nextDouble();
        System.out.println("Digite o Periodo em meses");
        this.Periodo = sc.nextDouble();
        System.out.printf("O total acumulado é:%.2f%n", calc.simples());
        sc.close();

    }
}
