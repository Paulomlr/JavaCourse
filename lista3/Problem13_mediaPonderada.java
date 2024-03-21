package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Problem13_mediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double media = 1;
        int [] pesos = {2, 3, 5};


        System.out.print("Quantos casos voce vai digitar? ");
        n = input.nextInt();

        for (int j = 1; j <= n; j++) {
            double calculate = 0;
            System.out.println("Digite tres numeros: ");

            for (int i = 0; i < n; i++) {

                media = input.nextDouble();
                calculate += media * pesos[i];
            }
            System.out.println("Media = " + (String.format("%.1f", calculate / 10)));
        }
        input.close();
    }
}
