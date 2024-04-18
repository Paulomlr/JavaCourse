package application;


import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = in.nextDouble();
        System.out.print("Months: ");
        int months = in.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + "months: ");
        System.out.println(String.format("%.2f", payment));
    }
}