package lista3;

import jdk.jshell.execution.JdiInitiator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem6_combustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        valor = input.nextInt();

        while(valor != 4){
            switch (valor){
                case 1: alcool += 1; break;
                case 2: gasolina += 1; break;
                case 3: diesel += 1; break;
            }
            System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            valor = input.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
