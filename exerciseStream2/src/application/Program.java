package application;


import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String file = in.nextLine();
        System.out.print("Enter a salary: ");
        double salary = in.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

        List<String> emails = list.stream()
                .filter(e -> e.getSalary() > salary)
                .map(Employee::getEmail)
                .sorted()
                .toList();

        emails.forEach(System.out::println);

        double sum = list.stream()
                .filter(e -> e.getName().charAt(0) == 'M')
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        in.close();
    }
}