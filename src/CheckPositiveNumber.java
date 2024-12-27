import java.util.List;

public class CheckPositiveNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 8, -3, 7);

        boolean allPositive = numbers.stream()
                .allMatch(num -> num > 0);

        System.out.println("Are all numbers positive? " + allPositive);
    }
}
