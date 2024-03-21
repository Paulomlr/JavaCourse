package lista2;

import java.util.Scanner;

public class Problem3_menorDeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.print("Primeiro valor: ");
        number1 = input.nextInt();
        System.out.print("Segundo valor: ");
        number2 = input.nextInt();
        System.out.print("Terceiro valor: ");
        number3 = input.nextInt();

        if(number1 < number2 && number1 < number3){
            System.out.println("MENOR:" + number1);
        }
        else if(number2 < number3){
            System.out.println("MENOR: " + number2);
        }
        else{
            System.out.println("MENOR: " + number3);
        }
        input.close();
    }
}
