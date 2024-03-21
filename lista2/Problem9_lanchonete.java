package lista2;

import java.util.Scanner;

public class Problem9_lanchonete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoProduto;
        int quantidadeComprada;
        double precoProduto = 0;

        System.out.print("Codigo do produto comprado: ");
        codigoProduto = input.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidadeComprada = input.nextInt();

        switch (codigoProduto){
            case 1: precoProduto = 5.0; precoProduto *= quantidadeComprada; break;
            case 2: precoProduto = 3.5; precoProduto *= quantidadeComprada; break;
            case 3: precoProduto = 4.8; precoProduto *= quantidadeComprada; break;
            case 4: precoProduto = 8.9; precoProduto *= quantidadeComprada; break;
            case 5: precoProduto = 7.32; precoProduto *= quantidadeComprada; break;
        }
        System.out.print("Valor a pagar: " + String.format("%.2f", precoProduto));
        input.close();
    }
}
