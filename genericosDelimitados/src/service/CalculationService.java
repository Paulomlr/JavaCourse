package service;

import java.util.List;

public class CalculationService{
    public static <T extends Comparable<T>> T max(List<T> list){ //esse método vai trabalhar com algum tipo T
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list){
            if (item.compareTo(max) > 0) { // compareTo não tá definido para o tipo T, então tenho que dizer que T extends Comparable<T>
                max = item;
            }
        }
        return max;
    }
}
