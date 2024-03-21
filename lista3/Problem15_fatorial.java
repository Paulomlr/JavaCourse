package lista3;

import java.util.Scanner;

public class Problem15_fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int fat = 1;

        System.out.print("Digite o valor de N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            fat *= i;
        }
        System.out.println("FATORIAL = " + fat);
        input.close();
    }
}
