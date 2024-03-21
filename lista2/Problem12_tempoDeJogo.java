package lista2;

import java.util.Scanner;

public class Problem12_tempoDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial;
        int horaFinal;

        System.out.print("Hora inicial: ");
        horaInicial = input.nextInt();
        System.out.print("Hora final: ");
        horaFinal = input.nextInt();

        if (horaInicial > horaFinal){
            horaInicial -= horaFinal;
            System.out.println("O JOGO DUROU " + Math.abs((horaInicial - 24)) + " HORA(S)");
        }
        else if (horaInicial < horaFinal){
            horaFinal -= horaInicial;
            System.out.println("O JOGO DUROU " + horaFinal + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        input.close();
    }
}
