package application;

import model.entities.CarRental;
import model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = in.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm) ");
        LocalDateTime start = LocalDateTime.parse(in.nextLine(), dtf);
        System.out.print("Retorno (dd/MM/yyyy hh:mm) ");
        LocalDateTime finish = LocalDateTime.parse(in.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        in.close();
    }
}

