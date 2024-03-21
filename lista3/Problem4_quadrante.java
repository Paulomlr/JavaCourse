package lista3;

import java.util.Scanner;

public class Problem4_quadrante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite os valorees das coordenadas X e Y: ");
        x = input.nextInt();
        y = input.nextInt();

        while(x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("QUADRANTE Q1");
            } else if (x < 0 && y < 0) {
                System.out.println("QUADRANTE Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("QUADRANTE Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANTE Q2");
            }
            System.out.println("Digite os valorees das coordenadas X e Y: ");
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
