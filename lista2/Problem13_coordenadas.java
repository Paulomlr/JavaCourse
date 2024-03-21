package lista2;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Problem13_coordenadas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X;
        double Y;

        System.out.print("Valor de X: ");
        X = input.nextDouble();
        System.out.print("Valor de Y: ");
        Y = input.nextDouble();

        if (X > 0 && Y > 0){
            System.out.println("Q1");
        }
        else if (X < 0 && Y < 0){
            System.out.println("Q3");
        }
        else if (X > 0 && Y < 0){
            System.out.println("Q4");
        }
        else if (X < 0 && Y > 0){
            System.out.println("Q2");
        }
        else if (X == 0 && Y != 0){
            System.out.println("Y");
        }
        else if (Y == 0 && X != 0){
            System.out.println("X");
        }
        else {
            System.out.println("Origem");
        }
        input.close();
    }
}
