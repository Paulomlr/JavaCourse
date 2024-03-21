package lista1;

import java.util.Locale;
import java.util.Scanner;

public class Problem3_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String name1;
        String name2;
        int age1;
        int age2;
        int x;

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        name1 = input.nextLine();
        System.out.print("Idade: ");
        age1 = input.nextInt();

        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        input.nextLine();// limpa buffer
        name2 = input.nextLine();
        System.out.print("Idade: ");
        age2 = input.nextInt();

        double average = (double) (age1 + age2) /2;
        System.out.println("A idade média de " + name1 + " e " + name2 + " é de " + average + " anos");

        input.close();
    }
}
