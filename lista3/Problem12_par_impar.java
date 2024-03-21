package lista3;

import java.util.Scanner;

public class Problem12_par_impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Quantos números voce vai digitar? ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++){
            int number;
            System.out.print("Digite um numero: ");
            number = input.nextInt();

            if(number > 0){
                if(number % 2 == 0){
                    System.out.println("PAR POSITIVO");
                }
                else {
                    System.out.println("IMPAR POSITIVO");
                }
            }
            else if(number < 0){
                if(number % 2 == 0){
                    System.out.println("PAR NEGATIVO");
                }
                else {
                    System.out.println("IMPAR NEGATIVO");
                }
            }
            else {
                System.out.println("NULO");
            }
        }
        input.close();
    }
}
