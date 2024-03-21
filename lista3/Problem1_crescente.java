package lista3;

import java.util.Scanner;

//ALUNO: Paulo César Pinheiro da Silva

public class Problem1_crescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite dois numeros: ");
        x = input.nextInt();
        y = input.nextInt();

        while (x != y){
            if(x > y){
                System.out.println("DECRESCENTE");
            }
            else {
                System.out.println("CRESCENTE");
            }
            System.out.println("Digite dois numeros: ");
            x = input.nextInt();
            y = input.nextInt();
        }

        input.close();
    }
}
