package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem6_circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio;
        double area;
        System.out.print("Digite o valor do raio do circulo: ");
        raio = input.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("AREA: " + String.format("%.3f", area));

        input.close();
    }
}
