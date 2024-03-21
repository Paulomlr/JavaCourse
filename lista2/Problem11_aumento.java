package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem11_aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salario;
        double calculate = 0;
        String porcentagem = "";

        System.out.print("Digite o salario da pessoa: ");
        salario = input.nextDouble();

        if (salario <= 1000) {
            calculate = (salario * 20) / 100;
            salario += calculate;
            porcentagem = "20 %";
        } else if (salario <= 3000) {
            calculate = (salario * 15) / 100;
            salario += calculate;
            porcentagem = "15 %";
        } else if (salario <= 8000) {
            calculate = (salario * 10) / 100;
            salario += calculate;
            porcentagem = "10 %";
        } else {
            calculate = (salario * 5) / 100;
            salario += calculate;
            porcentagem = "5 %";
        }

        System.out.println("Novo salario = R$ " + String.format("%.2f", salario));
        System.out.println("Aumento = R$ " + String.format("%.2f", calculate));
        System.out.println("Porcentagem = " + porcentagem);

        input.close();
    }
}
