import java.util.List;
import java.util.function.Consumer;

public class UppercaseConversion {
    public static void main(String[] args) {

        List<String> stringList = List.of("aladdin", "elmidar", "yusif");

        Consumer<String> consumer = str ->
                System.out.println((str.substring(0, 1).toUpperCase() + str.substring(1)));

        uppercase(stringList,consumer);


    }

    static void uppercase(List<String> strings, Consumer<String> consumer) {

        strings.stream().forEach(consumer);
    }
}

