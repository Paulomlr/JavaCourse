package exercise2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int codigoUnico = in.nextInt();
            a.add(codigoUnico);
        }

        System.out.print("How many students for course B? ");
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            int codigoUnico = in.nextInt();
            b.add(codigoUnico);
        }

        System.out.print("How many students for course C? ");
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            int codigoUnico = in.nextInt();
            c.add(codigoUnico);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
    }
}
