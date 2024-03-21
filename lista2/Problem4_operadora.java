package lista2;

import java.util.Scanner;

public class Problem4_operadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        double value = 50.0;

        System.out.print("Digite a quantidade de minutos: ");
        number = input.nextInt();
        if(number > 100){
            value += (number - 100)*2;
        }
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", value));

        input.close();
    }
}
