package lista1;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem2_retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0000");

        double base;
        double hight;

        System.out.print("Base do retângulo: ");
        base = input.nextDouble();
        System.out.print("Altura do retângulo: ");
        hight = input.nextDouble();

        double area = base * hight;
        double perimetro = 2 * (base + hight);
        double diagonal = Math.sqrt(Math.pow(base,2) + Math.pow(hight, 2));

        System.out.println("AREA: " + formatador.format(area));
        System.out.println("PERIMETRO: " + formatador.format(perimetro));
        System.out.println("DIAGONAL: " + formatador.format(diagonal));

        input.close();
    }
}
