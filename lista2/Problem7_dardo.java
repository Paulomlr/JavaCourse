package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem7_dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double distancia1;
        double distancia2;
        double distancia3;

        System.out.println("Digite as tres distancias: ");
        distancia1 = input.nextDouble();
        distancia2 = input. nextDouble();
        distancia3 = input.nextDouble();

        double calculate1 = (distancia1 + distancia2 + Math.abs(distancia1 - distancia2))/2;
        double calculate2 = (calculate1 + distancia3 + Math.abs(calculate1 - distancia3))/2;

        System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", calculate2));
        input.close();
    }
}
