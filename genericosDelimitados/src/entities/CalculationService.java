package entities;

import java.util.List;

public class CalculationService {
    public static Integer max(List<Integer> list){
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        Integer max = list.get(0);
        for (Integer item : list){
            if (item.compareTo(max) > 0) { // se isso for maior que zero, significa que item é maior que o max
                max = item;
            }
        }
        return max;
    }
}
