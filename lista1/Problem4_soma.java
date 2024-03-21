package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem4_soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        System.out.print("Digite o valor de X: ");
        x = input.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = input.nextInt();

        System.out.println("SOMA: " + (x + y));

        input.close();
    }
}
