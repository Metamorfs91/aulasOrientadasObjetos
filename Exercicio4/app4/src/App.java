import java.util.Locale;
import java.util.Scanner;
import entidade.Produto;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.println("Nome:");
        String name = sc.nextLine();
        System.out.println("Preco:");
        double price = sc.nextDouble();
        System.out.println("Quantidade em estoque:");
        int quantity = sc.nextInt();

        Produto product = new Produto(name, price, quantity);

        System.out.println();
        System.out.println("Dados do Produto: " + product);

        System.out.println();
        System.out.print("Quantidade de produtos a serem adicionados no estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Dados Atualizados." + product);
        System.out.println();
        System.out.print("Quantidade de produtos a serem removidas ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Dados Atualizados. " + product);

        sc.close();

    }
}
