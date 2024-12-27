import java.util.List;
import java.util.function.Predicate;

public class StringLengthFiltering {
    public static void main(String[] args) {

        List<String> stringList = List.of("book", "pen", "Kompyuter");

        Predicate<String> predicate = str -> str.length() > 5;

        filterLength(stringList, predicate);

    }


    static void filterLength(List<String> strings, Predicate<String> predicate) {
        strings.stream().filter(predicate).forEach(System.out::println);
    }
}
