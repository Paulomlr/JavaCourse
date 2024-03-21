package lista3;

import java.util.Scanner;

public class Problem3_senhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 2002;
        int number;

        System.out.print("Digite a senha: ");
        number = input.nextInt();

        if(number == senha){
            System.out.println("Acesso permitido!");
        }
        else {
            while(number != senha){
                System.out.print("Senha invalida! Tente novamente: ");
                number = input.nextInt();
            }
            System.out.println("Acesso permitido!");
        }

        input.close();
    }
}
