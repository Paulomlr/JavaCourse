package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem8_temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char caractere;
        double fahrenheit;
        double celsius;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        caractere = input.next().charAt(0);

        if (caractere == 'f' || caractere == 'F'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            fahrenheit = input.nextDouble();
            double c = ( (double) 5 /9 * (fahrenheit - 32));
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", c));
        }
        else if(caractere == 'c' || caractere == 'C'){
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = input.nextDouble();
            double f = (celsius * 9/5) + 32;
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", f));
        }
        input.close();
    }
}
