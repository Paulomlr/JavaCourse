package lista3;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Problem10_sequencia_impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.out.print("Digite o valor de X: ");
        x = input.nextInt();

        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        input.close();
    }
}
