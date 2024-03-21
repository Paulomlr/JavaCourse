package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem8_consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int distance;
        double combustivelGasto;

        System.out.print("Distancia percorrida: ");
        distance = input.nextInt();
        System.out.print("Combustível gasto: ");
        combustivelGasto = input.nextDouble();

        double consumoMedio = distance / combustivelGasto;

        System.out.println("Consumo médio: " + String.format("%.3f", consumoMedio));

        input.close();
    }
}
