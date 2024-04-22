package application;

import entities.Product;
import entities.ProductPredicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // list.removeIf(p -> p.getPrice() >= 100); // predicate

        // list.removeIf(new ProductPredicate()); // referência para métodos

        // list.removeIf(Product::staticProductPredicate); // referência para métodos/método estático

        // list.removeIf(Product::nonStaticProductPredicate);  // método não estático

        /*
        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() >= min;  // expressão lambda declarada
        list.removeIf(pred);
        */

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for(Product p: list){
            System.out.println(p);
        }

    }
}