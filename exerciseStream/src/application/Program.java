package application;


import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = in.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice()) // novo stream só com os preços do produto
                    .reduce(0.0, Double::sum) / list.size(); // usado para combinar todos os elementos do Stream em um único resultado

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg) // filtrar todo mundo que tem o preço abaixo da média
                    .map(p -> p.getName()) // pegar só o nome de cada produto
                    .sorted(comp.reversed()) // ordenar em ordem decrescente
                    // .sorted(Comparator.reverseOrder()) outra opção para ordenar em ordem decrescente
                    .toList();
            
            names.forEach(System.out::println);
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        in.close();
    }
}