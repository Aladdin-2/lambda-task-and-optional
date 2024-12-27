import java.util.List;
import java.util.function.Predicate;

public class ListFiltering {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(12, 11, 23, 45, 22);

        Predicate<Integer> filterOdd = integer -> integer % 2 == 0;

        integerList.stream().filter(filterOdd).forEach(System.out::println);

    }

    static void oddFilter(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate);
    }
}
