package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Problem2_media_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int age;
        double media = 0;

        System.out.println("Digite as idades: ");
        age = input.nextInt();

        int i = 0;

        if (age >= 0) {
            while (age >= 0) {
                media += age;
                age = input.nextInt();
                i++;
            }
            System.out.println("MEDIA: " + String.format("%.2f", (media / i)));
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }

        input.close();
    }
}
