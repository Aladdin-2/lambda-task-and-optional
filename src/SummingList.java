import java.util.List;

public class SummingList {
    public static void main(String[] args) {
        List<Double> numbers = List.of(12.5, 24.8, 7.6, 9.4, 15.3);

        double sum = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Sum of elements: " + sum);
    }
}
