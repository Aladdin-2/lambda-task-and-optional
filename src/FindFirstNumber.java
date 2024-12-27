import java.util.List;
import java.util.Optional;

public class FindFirstNumber {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 10, 12, 3, 4, 5, 23, 344);

        Optional<Integer> optionalI = integers.stream().filter(number -> number > 10).findFirst();


        optionalI.ifPresentOrElse(
                num-> System.out.println("greater than 10: "+num)
                ,()-> System.out.println("Not found!"));
    }


}
