import java.util.List;

public class ProductOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of elements: " + product);
    }
}
