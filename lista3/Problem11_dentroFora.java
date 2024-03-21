package lista3;

import java.util.Scanner;

public class Problem11_dentroFora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int dentro = 0;
        int fora = 0;

        System.out.print("Quantos números voce vai digitar? ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            int number;
            System.out.print("Digite um numero: ");
            number = input.nextInt();
            if(number >= 10 && number <= 20){
                dentro += 1;
            }
            else {
                fora += 1;
            }
        }
        System.out.println(dentro + " DENTRO");
        System.out.println(fora + " FORA");
        input.close();
    }
}
