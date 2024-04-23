import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); // operação intermediária
        System.out.println(Arrays.toString(st1.toArray())); // operação terminal

        int sum = list.stream().reduce(0, Integer::sum); // ou (x, y) -> x + y
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0) // filtrou os numeros que atendem a condição e gerou uma nova stream
                .map(x -> x * 10)  // gerando uma nova stream
                .toList();

        System.out.println(Arrays.toString(newList.toArray()));
    }
}