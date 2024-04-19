package covarianca_contravarianca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    public static void copy(List<? extends Number> sourced, List<? super Number> destiny){
        for (Number number : sourced){ // covariança: posso acessar os elementos mas não posso adicionar
            destiny.add(number); //contravariança: posso adicionar elementos mas não posso acessar
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list) {// Object pq pode ser qualquer tipo
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
