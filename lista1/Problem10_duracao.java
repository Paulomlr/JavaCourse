package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem10_duracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int seconds;

        System.out.print("Digite a duracao em segundos: ");
        seconds = input.nextInt();

        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

        input.close();
    }
}
