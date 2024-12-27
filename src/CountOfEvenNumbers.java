import java.util.List;
import java.util.function.Predicate;

public class CountOfEvenNumbers {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 24, 124, 18, 17, 12, 35, 21);

        Predicate<Integer> predicate = integer -> integer % 2 != 0;

        checkEvenNumber(integers, predicate);

    }

    static void checkEvenNumber(List<Integer> integers, Predicate<Integer> predicate) {
        System.out.println(integers.stream().filter(predicate).count());

    }
}
