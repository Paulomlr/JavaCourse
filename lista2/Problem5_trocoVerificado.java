package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem5_trocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double preco;
        int quatidadeComprada;
        double dinheiro;

        System.out.print("Preço unitário do produto: ");
        preco = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        quatidadeComprada = input.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiro = input.nextDouble();

        preco *= quatidadeComprada;

        if(dinheiro >= preco){
            dinheiro -= preco;
            System.out.println("TROCO: " + String.format("%.2f", dinheiro));
        }
        else{
            preco -= dinheiro;
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", preco) + " REAIS");
        }
        input.close();
    }
}
