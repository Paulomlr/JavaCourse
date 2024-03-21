package lista3;

import java.util.Scanner;

public class Problem9_soma_impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int soma = 0;

        System.out.println("Digite dois numeros: ");
        x = input.nextInt();
        y = input.nextInt();

        if(x > y){
            for( ; x > (y+1); x--){ // (y+1) porque só pode somar os números que estiverem entre x e y
                x -= 1;             // pelo x ser maior e a soma ser só dos impares entre eles excluindo o x, diminui um numero dele e verifica se ele é impar
                if(x % 2 != 0){
                    soma += x;
                }
                x += 1;             // sendo x um número impar ou não, o x volta a ser o mesmo valor do inicio do laço, e é decrementado logo em seguida pelo laço,
            }
            System.out.println("SOMA DOS IMPARES = " + soma);
        }
        else {
            for( ; x < (y-1); x--){ // (y-1) nesse caso, como o y é maior, diminuimos dele um número
                x += 1;             //  verifico os números entre x e y somando o x
                if(x % 2 != 0){
                    soma += x;
                }
                x += 1;             //sendo impar ou não, somamos o x mais um vez, e logo após, ele é decrementado pelo laço, pecorrendo assim, todos os valores entre x e y
            }
            System.out.println("SOMA DOS IMPARES = " + soma);
        }
        input.close();
    }
}
