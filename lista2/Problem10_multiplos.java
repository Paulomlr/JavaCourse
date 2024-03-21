package lista2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Problem10_multiplos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Digite dois numeros inteiros:");
        number1 = input.nextInt();
        number2 = input.nextInt();

        if (number1 % 2 == 0 && number2 % 2 == 0){
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }
        input.close();
    }
}
