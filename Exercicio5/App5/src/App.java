import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Bem Vindo ao Nilo Bank");
        System.out.println("Digite o numero da Conta");
        int number = sc.nextInt();
        System.out.println("Digite o seu nome:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Exite deposito inicial? (y/n)");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Digite o valor do Deposito:");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(number, holder, initialDeposit);
        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta atualizados");
        System.out.println(conta);

        System.out.print("Deseja realizar um saque? (s/n)");
        char response2 = sc.next().charAt(0);
        if (response2 == 'y') {

            System.out.println("Digite o Valor do saque");
            double whithdrawValue = sc.nextDouble();
            conta.whithdraw(whithdrawValue);
            System.out.println("Dados da conta atualizados");
            System.out.println(conta);
        } else {
            System.out.println("Obrigado pela preferencia");
        }
        sc.close();
    }
}
