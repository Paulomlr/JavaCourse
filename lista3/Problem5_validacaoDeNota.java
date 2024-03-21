package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Problem5_validacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double nota1;
        double nota2;

        System.out.print("Digite a primeira  nota: ");
        nota1 = input.nextDouble();

        while(nota1 < 0 || nota1 > 10){
            System.out.print("Valor invalido! Tente novamente: ");
            nota1 = input.nextDouble();
        }

        System.out.print("Digite a segunda  nota: ");
        nota2 = input.nextDouble();

        while(nota2 < 0 || nota2 > 10){
            System.out.print("Valor invalido! Tente novamente: ");
            nota2 = input.nextDouble();
        }

        double calculate = (nota1 + nota2)/2;
        System.out.println("MEDIA = " + String.format("%.2f", calculate));

        input.close();
    }
}
