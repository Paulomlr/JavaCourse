package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem1_terreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double largura;
        double comprimento;
        double metroQuadrado;

        System.out.print("Digite a largura do terreno: ");
        largura = input.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = input.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        metroQuadrado = input.nextDouble();

        largura *= comprimento;
        metroQuadrado *= largura;

        System.out.println("Area do terreno = " + String.format("%.2f", largura));
        System.out.println("Preco do terreno = " + String.format("%.2f", metroQuadrado));

        input.close();
    }
}
