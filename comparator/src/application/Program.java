package application;

import entities.Product;
import entities.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        /*

        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        // a função map só funciona para stream, então depois de converter para stream e usar o map, converter para lista usando collect.(Collectors.toList)
        // função map: ela aplica uma função a cada elemento da strem gerando uma nova stream com os elementos transformados

        */

        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // método estático

        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList(); // toList: um atalho para collect(Collectors.toList())

        /*
        Function<Product, String> func = p -> p.getName().toUpperCase(); // expressão lambda declarada

        List<String> names = list.stream().map(func).toList();
         */

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();
        names.forEach(System.out::println);

    }
}