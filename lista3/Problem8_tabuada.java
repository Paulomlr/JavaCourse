package lista3;

import java.util.Scanner;

public class Problem8_tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Deseja a tabuada para qual valor? ");
        n = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        input.close();
    }
}
