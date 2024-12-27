import java.util.List;
import java.util.Optional;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 24, 54, 8, 7, 989, 758);

        Optional<Integer> optionalI = integers.stream().max(Integer::compare);

        optionalI.ifPresentOrElse(num -> System.out.println("Maximum number: " + num),
                () -> System.out.println("Not found! "));
    }
}
