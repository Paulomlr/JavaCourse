package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exemplo1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(); //HasSet: mais rápido mas não mantém a ordem | TreeSet: ordena os dados | LinkedHasSet: mantém a ordem
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        //set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3); //remover todo elemento x tal que o tamanho de x seja maior ou igual a 3



        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}