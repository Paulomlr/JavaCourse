package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem9_medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.print("Digite a medida A: ");
        a = input.nextDouble();
        System.out.print("Digite a medida B: ");
        b = input.nextDouble();
        System.out.print("Digite a medida C: ");
        c = input.nextDouble();

        double areaDoQuadrado = Math.pow(a,2);
        double areaDoTriangulo = (a * b)/2;
        double areaDoTrapezio = ((a + b) * c) / 2;

        System.out.println("AREA DO QUADRADO: " + String.format("%.4f", areaDoQuadrado));
        System.out.println("AREA DO TRIANGULO: " + String.format("%.4f", areaDoTriangulo));
        System.out.println("AREA DO TRAPEZIO: " + String.format("%.4f", areaDoTrapezio));

        input.close();
    }
}
