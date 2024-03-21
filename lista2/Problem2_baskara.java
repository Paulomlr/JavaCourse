package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem2_baskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Coeficiente a: ");
        a = input.nextDouble();
        System.out.print("Coeficiente b: ");
        b = input.nextDouble();
        System.out.print("Coeficiente c: ");
        c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if(delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("X1: " + String.format("%.4f", x1));
            System.out.println("X2: " + String.format("%.4f", x2));
        }
        else if(delta == 0){
            double x1 = (-b /(2 * a));
            System.out.println("X1: " + String.format("%.4f", x1));
            System.out.println("X2: " + String.format("%.4f", x1));
        }
        else {
            System.out.println("Esta equação não possui raizes reais");
        }
        input.close();
    }
}
