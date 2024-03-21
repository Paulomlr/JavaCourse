package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem7_pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String name;
        double valorPorHora;
        int horasTrabalhadas;

        System.out.print("Nome: ");
        name = input.nextLine();
        System.out.print("Valor por hora: ");
        valorPorHora = input.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = input.nextInt();

        double pagamento = valorPorHora * horasTrabalhadas;

        System.out.println("O pagamento para " + name + " deve ser " + String.format("%.2f", pagamento));

        input.close();
    }
}
