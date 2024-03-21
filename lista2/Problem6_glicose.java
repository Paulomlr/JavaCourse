package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Problem6_glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double glicose;
        System.out.print("Digite a medida da glicose: ");
        glicose = input.nextDouble();

        if (glicose <= 100.0){
            System.out.println("Classificação: normal" );
        }
        else if (glicose <= 140.0){
            System.out.println("Classificação: elevado");
        }
        else{
            System.out.println("Classificação: diabetes" );
        }
        input.close();
    }
}
