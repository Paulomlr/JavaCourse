package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem5_troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double preco;
        double quantComprada;
        double dinheiroRecebido;

        System.out.print("Preço unitário do produto: ");
        preco = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantComprada = input.nextDouble();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = input.nextDouble();

        double multiplication = preco * quantComprada;
        double calculate = dinheiroRecebido - multiplication;

        System.out.println("TROCO: " + String.format("%.2f", calculate));

        input.close();
    }
}
