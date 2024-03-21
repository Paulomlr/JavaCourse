package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Problem14_divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Quantos casos voce vai digitar? ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            int numerador;
            int denominador;
            System.out.print("Entre com o numerador: ");
            numerador = input.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = input.nextInt();
            if(denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            }
            else {
                System.out.println("DIVISAO = " + (String.format("%.2f", (double) numerador/denominador)));
            }
        }
        input.close();
    }
}
