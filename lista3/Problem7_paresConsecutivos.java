package lista3;

import java.util.Scanner;

public class Problem7_paresConsecutivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Digite um numero inteiro: ");
        x = input.nextInt();

        while (x != 0){
            int vazio = x; // atribuindo x a outra variável para que tenha dois valores de x
            int count = 1; // contador para o somar os pares
            int count2 = 2; // para somar os pares consecutivos

            if (x % 2 == 0){
                while (count <= 4) {
                    vazio += x + count2; // conservando o valor de x mas somando ele sempre com 2 para obter o par consecutivo do x e guardando o valor na variável vazio
                    count2 += 2;
                    count++;
                }
                System.out.println("SOMA = " + vazio);
            }

            else {
                x++;
                vazio++;  //incrementando o valor de x e do vazio para começar a soma a partir de um número par
                while (count <= 4) {
                    vazio += x + count2;
                    count2 += 2;
                    count++;
                }
                System.out.println("SOMA = " + vazio);
            }

            System.out.print("Digite um numero inteiro: ");
            x = input.nextInt();
        }
        input.close();
    }
}

