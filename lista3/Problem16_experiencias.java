package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Problem16_experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        int total = 0;
        int cobaias;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;


        System.out.print("Quantos casos de teste serao digitados? ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){

            char tipoCobaia;
            System.out.print("Quantidade de cobaias: ");
            cobaias = input.nextInt();
            total += cobaias;

            System.out.print("Tipo de cobaia: ");
            tipoCobaia = input.next().charAt(0);

            if(tipoCobaia == 'c' || tipoCobaia == 'C'){
                coelhos += cobaias;
            }
            else if(tipoCobaia == 'r' || tipoCobaia == 'R'){
                ratos += cobaias;
            }
            else sapos += cobaias;
        }
        System.out.println();
        System.out.println("TOTAL: " + total + " cobaias");
        System.out.println("TOTAL DE COELHOS: " + coelhos);
        System.out.println("TOTAL DE RATOS: " + ratos);
        System.out.println("TOTAL DE SAPOS: " + sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", (double) (coelhos * 100)/total));
        System.out.println("Percentual de ratos: " + String.format("%.2f", (double) (ratos * 100)/total));
        System.out.println("Percentual de sapos: " + String.format("%.2f", (double) (sapos * 100)/total));
        input.close();
    }
}
