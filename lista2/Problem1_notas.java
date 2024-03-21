package lista2;

import java.util.Locale;
import java.util.Scanner;

//Aluno: Paulo César Pinheiro da Silva

public class Problem1_notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.print("Digite a primeira nota: ");
        number1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        number2 = input.nextDouble();

        double calculate = number1 + number2;
        System.out.println("NOTA FINAL: " + calculate);

        if (calculate < 60.00) {
            System.out.println("REPROVADO");
        }

        input.close();
    }
}
